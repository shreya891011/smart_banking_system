package servlet;

import dao.TransactionDAO;
import model.Customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet{

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,IOException{

        HttpSession session=request.getSession(false);

        if(session==null || session.getAttribute("customer")==null){

            response.sendRedirect("login.jsp");
            return;

        }

        Customer customer=(Customer)session.getAttribute("customer");

        String receiver=request.getParameter("receiver");

        double amount=Double.parseDouble(request.getParameter("amount"));

        TransactionDAO dao=new TransactionDAO();

        if(!dao.accountExists(receiver)){

            response.getWriter().println("<h2>Receiver Account Not Found!</h2>");
            return;

        }

        boolean status=dao.transfer(customer.getAccountNo(),receiver,amount);

        if(status){

            customer.setBalance(customer.getBalance()-amount);

            session.setAttribute("customer",customer);

            response.sendRedirect("dashboard.jsp");

        }else{

            response.getWriter().println("<h2>Transfer Failed! Insufficient Balance.</h2>");

        }

    }

}
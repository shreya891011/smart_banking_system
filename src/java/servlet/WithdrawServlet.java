package servlet;

import dao.TransactionDAO;
import model.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet 
{
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        double amount = Double.parseDouble(request.getParameter("amount"));
        TransactionDAO dao = new TransactionDAO();

        if (dao.withdraw(customer.getAccountNo(), amount)) 
        {
            customer.setBalance(customer.getBalance() - amount);
            session.setAttribute("customer", customer);
            response.sendRedirect("dashboard.jsp");
        } 
        else
        {
         response.getWriter().println("Insufficient Balance");
        }

    }

}
package servlet;

import dao.TransactionDAO;
import model.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet 
{
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("customer") == null)
        {
          response.sendRedirect("login.jsp");
          return;
        }

        Customer customer = (Customer) session.getAttribute("customer");
       double amount = Double.parseDouble(request.getParameter("amount"));
        TransactionDAO dao = new TransactionDAO();

        if (dao.deposit(customer.getAccountNo(), amount)) 
        {
           customer.setBalance(customer.getBalance() + amount);
           session.setAttribute("customer", customer);
           response.sendRedirect("dashboard.jsp");
        }
        else 
        {
            response.getWriter().println("Deposit Failed");
        }

    }

}
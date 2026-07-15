package servlet;

import dao.CustomerDAO;
import model.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)      throws ServletException, IOException
    {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        CustomerDAO dao = new CustomerDAO();
        Customer customer = dao.getCustomerByEmail(email);

        if(customer == null)
        {
            response.getWriter().println("Email not found.");
            return;
        }

        if(customer.getAccountStatus().equalsIgnoreCase("LOCKED"))
        {
            response.getWriter().println("Your account is locked after 3 incorrect PIN attempts.");
            return;
        }

        if(customer.getPassword().equals(password))
        {
            dao.resetAttempts(email);
            HttpSession session = request.getSession();
            session.setAttribute("customer", customer);
            response.sendRedirect("dashboard.jsp");
        }
        else
        {
            int attempts = customer.getFailedAttempts() + 1;

            if(attempts >= 3)
            {
                dao.updateAttempts(email, attempts);
                dao.lockAccount(email);
                response.getWriter().println("Account Locked! You entered the wrong PIN 3 times.");
            }
            else
            {
                dao.updateAttempts(email, attempts);
                response.getWriter().println("Incorrect PIN. Remaining Attempts : " + (3 - attempts));
            }
        }
    }
}

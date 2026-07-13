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
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
    {
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        CustomerDAO dao=new CustomerDAO();
        Customer customer=dao.login(email,password);

        if(customer!=null)
        {
           HttpSession session=request.getSession();
            session.setAttribute("customer",customer);
            response.sendRedirect("dashboard.jsp");
        }
        else
        {
            response.getWriter().println("Invalid Email or Password");
        }
    }
}
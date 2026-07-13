package servlet;

import dao.CustomerDAO;
import model.Customer;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
    {
        Customer customer=new Customer();
        Random random=new Random();
        customer.setAccountNo(String.valueOf(100000+random.nextInt(900000)));
        customer.setName(request.getParameter("name"));
        customer.setEmail(request.getParameter("email"));
        customer.setPhone(request.getParameter("phone"));
        customer.setAddress(request.getParameter("address"));
        customer.setPassword(request.getParameter("password"));
        customer.setAccountType(request.getParameter("accountType"));
        customer.setBalance(Double.parseDouble(request.getParameter("balance")));

        CustomerDAO dao=new CustomerDAO();

        if(dao.registerCustomer(customer))
        {
            response.sendRedirect("login.jsp");
        }
        else
        {
            response.getWriter().println("Registration Failed");

        }

    }

}
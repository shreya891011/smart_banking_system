package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Customer;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

Customer customer=(Customer)session.getAttribute("customer");

if(customer==null){

response.sendRedirect("login.jsp");

return;

}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<title>Dashboard</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("\n");
      out.write("<div class=\"logo\">\n");
      out.write("\n");
      out.write("Smart Banking\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"user\">\n");
      out.write("\n");
      out.write("Welcome,\n");
      out.write("\n");
      out.write("<b>");
      out.print(customer.getName());
      out.write("</b>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"dashboard\">\n");
      out.write("\n");
      out.write("<div class=\"welcome-card\">\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<h1>\n");
      out.write("\n");
      out.write("Hello,\n");
      out.write("\n");
      out.print(customer.getName());
      out.write(" \n");
      out.write("\n");
      out.write("</h1>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("\n");
      out.write("Welcome back to Smart Banking.\n");
      out.write("\n");
      out.write("Manage your account securely.\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-building-columns\"\n");
      out.write("style=\"font-size:70px;opacity:.3;\"></i>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"dashboard-grid\">\n");
      out.write("\n");
      out.write("<div class=\"profile-card\">\n");
      out.write("\n");
      out.write("<h2>\n");
      out.write("\n");
      out.write("Profile Information\n");
      out.write("\n");
      out.write("</h2>\n");
      out.write("\n");
      out.write("<table class=\"profile-table\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Account Number</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(customer.getAccountNo());
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Account Type</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(customer.getAccountType());
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Email</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(customer.getEmail());
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Phone</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(customer.getPhone());
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>Address</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(customer.getAddress());
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"balance-box\">\n");
      out.write("\n");
      out.write("<h4>\n");
      out.write("\n");
      out.write("Available Balance\n");
      out.write("\n");
      out.write("</h4>\n");
      out.write("\n");
      out.write("<h1>\n");
      out.write("\n");
      out.write("? ");
      out.print(String.format("%,.2f",customer.getBalance()));
      out.write("\n");
      out.write("\n");
      out.write("</h1>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"stats\">\n");
      out.write("\n");
      out.write("<div class=\"stat\">\n");
      out.write("\n");
      out.write("<h2>24/7</h2>\n");
      out.write("\n");
      out.write("<p>Secure Banking</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"stat\">\n");
      out.write("\n");
      out.write("<h2>100%</h2>\n");
      out.write("\n");
      out.write("<p>Safe Transactions</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"stat\">\n");
      out.write("\n");
      out.write("<h2>Online</h2>\n");
      out.write("\n");
      out.write("<p>Account Access</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"action-grid\">\n");
      out.write("\n");
      out.write("<a href=\"deposit.jsp\" class=\"action deposit\">\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-money-bill-wave\"></i>\n");
      out.write("\n");
      out.write("<h3>Deposit</h3>\n");
      out.write("\n");
      out.write("<p>Add Money</p>\n");
      out.write("\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<a href=\"withdraw.jsp\" class=\"action withdraw\">\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-wallet\"></i>\n");
      out.write("\n");
      out.write("<h3>Withdraw</h3>\n");
      out.write("\n");
      out.write("<p>Withdraw Funds</p>\n");
      out.write("\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<a href=\"transfer.jsp\" class=\"action transfer\">\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-right-left\"></i>\n");
      out.write("\n");
      out.write("<h3>Transfer</h3>\n");
      out.write("\n");
      out.write("<p>Transfer Money</p>\n");
      out.write("\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<a href=\"history.jsp\" class=\"action history\">\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-clock-rotate-left\"></i>\n");
      out.write("\n");
      out.write("<h3>History</h3>\n");
      out.write("\n");
      out.write("<p>View Transactions</p>\n");
      out.write("\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<a href=\"LogoutServlet\" class=\"action logout\">\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-right-from-bracket\"></i>\n");
      out.write("\n");
      out.write("<h3>Logout</h3>\n");
      out.write("\n");
      out.write("<p>Sign Out</p>\n");
      out.write("\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("\n");
      out.write("© 2026 Smart Banking System\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("Developed by <b>Shreya Lathi</b>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

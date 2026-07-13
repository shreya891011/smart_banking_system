package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Customer;

public final class withdraw_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Withdraw Money</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("<script src=\"js/validation.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("\n");
      out.write("<div class=\"logo\">\n");
      out.write("\n");
      out.write("? Smart Banking System\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"page\">\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("\n");
      out.write("<h2>\n");
      out.write("\n");
      out.write("? Withdraw Money\n");
      out.write("\n");
      out.write("</h2>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("\n");
      out.write("Current Balance\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<div class=\"balance-card\">\n");
      out.write("\n");
      out.write("<h1>\n");
      out.write("\n");
      out.write("? ");
      out.print(customer.getBalance());
      out.write("\n");
      out.write("\n");
      out.write("</h1>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<form action=\"WithdrawServlet\"\n");
      out.write("\n");
      out.write("method=\"post\"\n");
      out.write("\n");
      out.write("onsubmit=\"return validateAmount()\">\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\n");
      out.write("<label>\n");
      out.write("\n");
      out.write("Withdraw Amount\n");
      out.write("\n");
      out.write("</label>\n");
      out.write("\n");
      out.write("<input\n");
      out.write("\n");
      out.write("type=\"number\"\n");
      out.write("\n");
      out.write("id=\"amount\"\n");
      out.write("\n");
      out.write("name=\"amount\"\n");
      out.write("\n");
      out.write("placeholder=\"Enter Amount\"\n");
      out.write("\n");
      out.write("required>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<input\n");
      out.write("\n");
      out.write("type=\"submit\"\n");
      out.write("\n");
      out.write("value=\"Withdraw\"\n");
      out.write("\n");
      out.write("class=\"btn\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<div class=\"link\">\n");
      out.write("\n");
      out.write("<a href=\"dashboard.jsp\">\n");
      out.write("\n");
      out.write("? Dashboard\n");
      out.write("\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("\n");
      out.write("© Smart Banking System\n");
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

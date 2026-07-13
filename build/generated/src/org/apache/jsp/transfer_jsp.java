package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Customer;

public final class transfer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    Customer customer = (Customer) session.getAttribute("customer");

    if (customer == null) {
        response.sendRedirect("login.jsp");
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("    <title>Transfer Money | Smart Banking System</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\">\n");
      out.write("\n");
      out.write("    <script src=\"js/validation.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- ================= NAVBAR ================= -->\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("\n");
      out.write("    <div class=\"logo\">\n");
      out.write("\n");
      out.write("        🏦 Smart Banking\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"user\">\n");
      out.write("\n");
      out.write("        Welcome,\n");
      out.write("\n");
      out.write("        <b>");
      out.print(customer.getName());
      out.write("</b>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- ================= PAGE ================= -->\n");
      out.write("\n");
      out.write("<div class=\"transaction-container\">\n");
      out.write("\n");
      out.write("    <div class=\"transaction-grid\">\n");
      out.write("\n");
      out.write("        <!-- LEFT PANEL -->\n");
      out.write("\n");
      out.write("        <div class=\"info-panel\">\n");
      out.write("\n");
      out.write("            <h2>\n");
      out.write("\n");
      out.write("                <i class=\"fa-solid fa-user\"></i>\n");
      out.write("\n");
      out.write("                Account Details\n");
      out.write("\n");
      out.write("            </h2>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("\n");
      out.write("                <strong>Account Holder</strong><br>\n");
      out.write("\n");
      out.write("                ");
      out.print(customer.getName());
      out.write("\n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("\n");
      out.write("                <strong>Account Number</strong><br>\n");
      out.write("\n");
      out.write("                ");
      out.print(customer.getAccountNo());
      out.write("\n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("\n");
      out.write("                <strong>Account Type</strong><br>\n");
      out.write("\n");
      out.write("                ");
      out.print(customer.getAccountType());
      out.write("\n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <div class=\"balance-display\">\n");
      out.write("\n");
      out.write("                <h4>\n");
      out.write("\n");
      out.write("                    Available Balance\n");
      out.write("\n");
      out.write("                </h4>\n");
      out.write("\n");
      out.write("                <h1>\n");
      out.write("\n");
      out.write("                    ₹ ");
      out.print(String.format("%,.2f",customer.getBalance()));
      out.write("\n");
      out.write("\n");
      out.write("                </h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- RIGHT PANEL -->\n");
      out.write("\n");
      out.write("        <div class=\"transaction-form\">\n");
      out.write("\n");
      out.write("            <h2>\n");
      out.write("\n");
      out.write("                <i class=\"fa-solid fa-right-left\"></i>\n");
      out.write("\n");
      out.write("                Transfer Money\n");
      out.write("\n");
      out.write("            </h2>\n");
      out.write("\n");
      out.write("            <form action=\"TransferServlet\"\n");
      out.write("                  method=\"post\"\n");
      out.write("                  onsubmit=\"return validateTransfer()\">\n");
      out.write("\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("\n");
      out.write("                    <i class=\"fa-solid fa-building-columns\"></i>\n");
      out.write("\n");
      out.write("                    <input\n");
      out.write("                        type=\"text\"\n");
      out.write("                        name=\"receiver\"\n");
      out.write("                        placeholder=\"Receiver Account Number\"\n");
      out.write("                        required>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("\n");
      out.write("                    <i class=\"fa-solid fa-indian-rupee-sign\"></i>\n");
      out.write("\n");
      out.write("                    <input\n");
      out.write("                        type=\"number\"\n");
      out.write("                        id=\"amount\"\n");
      out.write("                        name=\"amount\"\n");
      out.write("                        placeholder=\"Transfer Amount\"\n");
      out.write("                        min=\"1\"\n");
      out.write("                        step=\"0.01\"\n");
      out.write("                        required>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button\n");
      out.write("                    type=\"submit\"\n");
      out.write("                    class=\"btn btn-blue\">\n");
      out.write("\n");
      out.write("                    <i class=\"fa-solid fa-paper-plane\"></i>\n");
      out.write("\n");
      out.write("                    Transfer Money\n");
      out.write("\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <a\n");
      out.write("                href=\"dashboard.jsp\"\n");
      out.write("                class=\"back-dashboard\">\n");
      out.write("\n");
      out.write("                <i class=\"fa-solid fa-arrow-left\"></i>\n");
      out.write("\n");
      out.write("                Back to Dashboard\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("\n");
      out.write("    © 2026 Smart Banking System\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    Developed by <b>Shreya Lathi</b>\n");
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

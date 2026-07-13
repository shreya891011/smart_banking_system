package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dao.TransactionDAO;
import model.Customer;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

Customer customer=(Customer)session.getAttribute("customer");

if(customer==null){

response.sendRedirect("login.jsp");

return;

}

TransactionDAO dao=new TransactionDAO();

ResultSet rs=dao.getTransactions(customer.getAccountNo());


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
      out.write("<title>Transaction History</title>\n");
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
      out.write("Smart Banking\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"user\">\n");
      out.write("\n");
      out.print(customer.getName());
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"history-wrapper\">\n");
      out.write("\n");
      out.write("<div class=\"history-header\">\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<h2>\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-clock-rotate-left\"></i>\n");
      out.write("\n");
      out.write("Transaction History\n");
      out.write("\n");
      out.write("</h2>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("\n");
      out.write("View all your banking activities\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"history-card\">\n");
      out.write("\n");
      out.write("<table class=\"history-table\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>Date</th>\n");
      out.write("\n");
      out.write("<th>Transaction</th>\n");
      out.write("\n");
      out.write("<th>Amount</th>\n");
      out.write("\n");
      out.write("<th>Balance</th>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");


boolean found=false;

while(rs.next()){

found=true;

String type=rs.getString("transaction_type");


      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.print(rs.getTimestamp("transaction_date"));
      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");


if(type.equalsIgnoreCase("Deposit")){


      out.write("\n");
      out.write("\n");
      out.write("<span class=\"deposit-color\">\n");
      out.write("\n");
      out.write("Deposit\n");
      out.write("\n");
      out.write("</span>\n");
      out.write("\n");


}else if(type.equalsIgnoreCase("Withdraw")){


      out.write("\n");
      out.write("\n");
      out.write("<span class=\"withdraw-color\">\n");
      out.write("\n");
      out.write("Withdraw\n");
      out.write("\n");
      out.write("</span>\n");
      out.write("\n");


}else if(type.equalsIgnoreCase("Transfer")){


      out.write("\n");
      out.write("\n");
      out.write("<span class=\"transfer-color\">\n");
      out.write("\n");
      out.write("Transfer\n");
      out.write("\n");
      out.write("</span>\n");
      out.write("\n");


}else{


      out.write("\n");
      out.write("\n");
      out.write("<span class=\"receive-color\">\n");
      out.write("\n");
      out.write("Received\n");
      out.write("\n");
      out.write("</span>\n");
      out.write("\n");


}


      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("₹ ");
      out.print(String.format("%,.2f",rs.getDouble("amount")));
      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("₹ ");
      out.print(String.format("%,.2f",rs.getDouble("balance_after")));
      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");


}

if(!found){


      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td colspan=\"4\">\n");
      out.write("\n");
      out.write("<div class=\"no-record\">\n");
      out.write("\n");
      out.write("No Transactions Found\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");


}


      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<a\n");
      out.write("href=\"dashboard.jsp\"\n");
      out.write("class=\"back-btn\">\n");
      out.write("\n");
      out.write("<i class=\"fa-solid fa-arrow-left\"></i>\n");
      out.write("\n");
      out.write("Back to Dashboard\n");
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

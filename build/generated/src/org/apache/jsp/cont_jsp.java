package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cont_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("}\n");
      out.write("th, td {\n");
      out.write("    padding: 5px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"C:/background.jpg\">\n");
      out.write("<br>\n");
      out.write("<center><h1><b>CONTACT US</h1></b></center>\n");
      out.write("<BR>\n");
      out.write("<h1 style=\"text-align:center\">A.P.J.ABDUL KALAM MEMORIAL SCHOOL</h1>\n");
      out.write("<center>R-45, 120 FEET ROAD, MOGAPPAIR</center>\n");
      out.write("<center>CHENNAI ? 600 050</center>\n");
      out.write("<center>TAMIL NADU</center>\n");
      out.write("<center>INDIA</center>\n");
      out.write("<center>PHONE NO.: 044 26242340 / 26243818</center>\n");
      out.write("\n");
      out.write("<center><b><h1>PRINCIPAL</h1></b></center>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<table style=\"width:50%\">\n");
      out.write("  <tr>\n");
      out.write("    <th>PRINCIPAL</th>\n");
      out.write("    <th>G.S.VIDYA</th>\n");
      out.write("     </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>E-mail</th>\n");
      out.write("    <th>vidyags@gmail.com</th>\n");
      out.write("     </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>Phone No</th>\n");
      out.write("    <th>9840762575</th>\n");
      out.write("     </tr>\n");
      out.write("</center>\n");
      out.write("  \n");
      out.write("   </table><br>\n");
      out.write("<center><b><h1>CHAIRMAN</h1></b></center>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<table style=\"width:50%\">\n");
      out.write("  <tr>\n");
      out.write("    <th>CHAIRMAN</th>\n");
      out.write("    <th>U.SNEGA</th>\n");
      out.write("     </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>E-mail</th>\n");
      out.write("    <th>snegau@gmail.com</th>\n");
      out.write("     </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>Phone No</th>\n");
      out.write("    <th>9176231159</th>\n");
      out.write("     </tr>\n");
      out.write("</center>\n");
      out.write("  \n");
      out.write("   </table>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

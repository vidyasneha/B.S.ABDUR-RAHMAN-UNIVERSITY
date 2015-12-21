package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<BR>\n");
      out.write("<h1 style=\"text-align:center\">A.P.J.ABDUL KALAM MEMORIAL SCHOOL</h1><br>\n");
      out.write("<BR>\n");
      out.write("<center><b><h3>FEE STRUCTURE (PER MONTH) </h3></b></center>\n");
      out.write("\n");
      out.write("<table style=\"width:100%\">\n");
      out.write("  <tr>\n");
      out.write("    <th>1</th>\n");
      out.write("    <th>Admission Fee</th>\n");
      out.write("     <th>Rs. 25.00</th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>2</th>\n");
      out.write("    <th>Re Admission Fee</th>\n");
      out.write("     <th>Rs 100.00</th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>3</th>\n");
      out.write("    <th>Tutition Fee</th>\n");
      out.write("     <th></th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>3(a)</th>\n");
      out.write("    <th>Class IX & X (Boys)</th>\n");
      out.write("     <th>Rs 200.00</th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>3(b)</th>\n");
      out.write("    <th>Class XI & XII Commerce & Humanities (Boys)</th>\n");
      out.write("     <th>Rs 300.00</th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>3(c)</th>\n");
      out.write("    <th>Class XI & XII Science (Boys)</th>\n");
      out.write("     <th>Rs.400.00</th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>4</th>\n");
      out.write("    <th>Computer Fund</th>\n");
      out.write("     <th></th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>4(a)</th>\n");
      out.write("    <th>Class III onwards wherever Computer Education is being imparted</th>\n");
      out.write("     <th>Rs 100.00</th>\n");
      out.write(" </tr>\n");
      out.write("<tr>\n");
      out.write("    <th>4(b)</th>\n");
      out.write("    <th>Computer Science Fee. (for elective subjects) + 2 stage</th>\n");
      out.write("     <th>Rs 150.00</th>\n");
      out.write(" </tr>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("   \n");
      out.write("   </table>\n");
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

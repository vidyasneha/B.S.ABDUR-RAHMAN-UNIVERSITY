package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adm2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body BACKGROUND=\"C:\\background.jpg\"><CENTER>\n");
      out.write("        <h3>ADMISSION FORM</h3>\n");
      out.write("        <form method=\"post\" action=\"dbadm2.jsp\">\n");
      out.write("            <table border='0'>\n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("  <td><LABEL for=\"fname\">First Name:<sup style=\"color:#F00\">*</sup> </LABEL></td>\n");
      out.write("\n");
      out.write("         <td><INPUT type=\"text\" name=\"fname\"></td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("  <td><LABEL for=\"lname\">Last Name:<sup style=\"color:#F00\">*</sup> </LABEL></td>\n");
      out.write("\n");
      out.write("  <td><INPUT type=\"text\" name=\"lname\"></td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("   <td><LABEL for=\"gender\">Gender:<sup style=\"color:#F00\">*</sup> </LABEL></td> <td><INPUT type=\"radio\" name=\"gender\" value=\"male\"> Male\n");
      out.write("\n");
      out.write("   <INPUT type=\"radio\" name=\"gender\" value=\"female\"> Female </td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("     <td><label  for=\"dob\">Date of Birth:<sup style=\"color:red\">*</sup> </label></td>\n");
      out.write("     <td><input type=\"text\" name=\"dob\" title=\"dd/mm/yyyy\"/></td>\n");
      out.write(" </tr>\n");
      out.write(" <tr>\n");
      out.write("     <td><label for=\"age\">Age:</label></td>\n");
      out.write("     <td><input type=\"text\" name=\"age\"></td>\n");
      out.write(" </tr>\n");
      out.write("  <tr>\n");
      out.write("\n");
      out.write("  <td><LABEL for=\"par\">Parent/Guardian Name:<sup style=\"color:red;\">*</sup> </LABEL></td>\n");
      out.write("\n");
      out.write("  <td><INPUT type=\"text\" name=\"par\"></td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("  <td><LABEL for=\"addr\" style=\"text-align:left;\">Address:<sup style=\"color:#F00\">*</sup> </LABEL></td>\n");
      out.write("\n");
      out.write("  <td><textarea   name=\"addr\" rows=\"4\" cols=\"20\"></textarea>  \n");
      out.write("\n");
      out.write("  </td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write(" \n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("  <td><LABEL for=\"cont\">Contact Number:<sup style=\"color:#F00\">*</sup> </LABEL></td>\n");
      out.write("\n");
      out.write("  <td><INPUT type=\"text\" name=\"cont\"></td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("  <td><LABEL for=\"email\">Email:<sup style=\"color:red;\">*</sup> </LABEL></td>\n");
      out.write("\n");
      out.write("  <td><INPUT type=\"text\" name=\"email\"></td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write(" \n");
      out.write("  <tr>\n");
      out.write("\n");
      out.write("   <td><LABEL for=\"trans\">Do you want to request \n");
      out.write("transportation services\n");
      out.write(" for the student:<sup style=\"color:#F00\">*</sup> </LABEL></td> <td><INPUT type=\"radio\" name=\"trans\" value=\"yes\"> Yes\n");
      out.write("\n");
      out.write("   <INPUT type=\"radio\" name=\"trans\" value=\"no\"> No</td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write(" \n");
      out.write(" <tr> \n");
      out.write(" <td></td><td><br/>\n");
      out.write("      <input type=\"submit\" value=\"Submit\" onclick=\"alert('Submitted successfully')\"/>\n");
      out.write("  <INPUT type=\"reset\" onClick=\"return confirmreset()\"></td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write(" \n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("  <td></td><td style=\"font-size:8px;text-align:right;\"><br/><i style=\"color:red;font-size:12px;align:right;\" >* - Mandatory</i></td>\n");
      out.write("\n");
      out.write(" </tr>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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

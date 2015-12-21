package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("    <h1><center>FEEDBACK FORM</center></h1>\n");
      out.write("    </head>\n");
      out.write("<body background=\"C:\\background.jpg\">\n");
      out.write("    <form method='post' action=\"dbfed.jsp\"><center>\n");
      out.write("  <table><tr><td></td></tr><tr><td></td></tr>\n");
      out.write("      <tr><td>Name:</td> <td><input type='text' name='name' id='name' align=\"center\"/></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>\n");
      out.write("      <tr><td>Roll number:</td><td> <input type='text' name='rollno' id='email' /></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>\n");
      out.write("      <tr><td>Class:</td><td> <input type='text' name='class' id='website'/></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>\n");
      out.write("<tr><td>Comment:</td>\n");
      out.write("    <td><textarea name='comment' id='comment'></textarea></td></tr>\n");
      out.write("  <tr> <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>\n");
      out.write(" <td></td><td><input type='submit' value='Submit' onclick=\"alert('Feedback submitted sucessfully')\"/></td>\n");
      out.write("</tr>\n");
      out.write("</form>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chkassgn2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\n");
      out.write("\n");
      out.write("<p id=\"demo\">Display the result here.</p>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function sne() {\n");
      out.write("var greeting;\n");
      out.write("if(document.ass.class.value=='6') {\n");
      out.write("    if(document.ass.subject.value=='english')\n");
      out.write("        greeting = \"write\";\n");
      out.write("    else\n");
      out.write("        greeting = \"hmm\";\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("    greeting = \"cla\";\n");
      out.write("}\n");
      out.write("    }\n");
      out.write("document.getElementById(\"demo\").innerHTML = greeting;\n");
      out.write("</script>\n");
      out.write("class: <input type=\"text\" name=\"class\"/>\n");
      out.write("subject:<input type=\"text\" name=\"subject\"/>\n");
      out.write("<input type=\"submit\" value=\"Submit\" onclick=\"sne()\"/>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

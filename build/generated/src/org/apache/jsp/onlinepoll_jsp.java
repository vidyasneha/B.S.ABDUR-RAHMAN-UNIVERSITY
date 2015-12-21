package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class onlinepoll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Online Poll</title>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            function checkRadio() {\n");
      out.write("                var result = \"\";\n");
      out.write("                var len = document.frmOne.result.length;\n");
      out.write("                var i;\n");
      out.write("                for(i=0; i<len; i++) {\n");
      out.write("                    if(document.frmOne.result[i].checked) {\n");
      out.write("                        result = document.fromOne.result[i].value;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                if (result==\"\") {\n");
      out.write("                    document.getElementById(\"radio_error\").innerHTML = \"No option selected\";\n");
      out.write("                    return false;\n");
      out.write("                  }\n");
      out.write("                else {\n");
      out.write("                    document.getElementById(\"radio_error\").innerHTML = \"\";\n");
      out.write("                    return true;\n");
      out.write("                     }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>VOTE OF YOUR CHOICE</h1>\n");
      out.write("        <form name=\"frmOne\" value=\"frmOne\">\n");
      out.write("        Are the reports of your wards reach you as per scedule?<br><br>\n");
      out.write("        <input type = \"radio\" name = \"result\" value=\"option1\">Always<br>\n");
      out.write("        <input type = \"radio\" name = \"result\" value=\"option2\">Sometimes<br>\n");
      out.write("        <input type = \"radio\" name = \"result\" value=\"option3\">Never<br><br>\n");
      out.write("        <input type =\"submit\" value=\"Submit\" onclick=\"checkRadio()\">\n");
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

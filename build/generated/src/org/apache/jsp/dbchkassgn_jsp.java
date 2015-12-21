package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dbchkassgn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\n");
      out.write("<HTML>    \n");
      out.write("    <HEAD>        \n");
      out.write("        <TITLE>Assignments</TITLE>    \n");
      out.write("    </HEAD>    \n");
      out.write("    <BODY background=\"C:/background.jpg\">    <CENTER>    \n");
      out.write("        <H1>ASSIGNMENTS FOR TODAY</H1>  <BR><BR><BR>      \n");
      out.write("        ");
 Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/school", "sneha", "jasmine");            
           Statement statement = connection.createStatement();            
           String clas = request.getParameter("clas"); 
           String subject = request.getParameter("subject");
           ResultSet rs = statement.executeQuery("select *from chkassgntb where clas = '" + clas + "' and subject = '" + subject + "'");             
           if(!rs.next()) {                 
           out.println("Sorry, could not find that publisher. ");  } 
           else {         
        
      out.write("        \n");
      out.write("        <TABLE BORDER=\"0\">            \n");
      out.write("            \n");
      out.write("            <TR>               \n");
      out.write("                <td><B>CLASS - </B></TD><TD> ");
      out.print( rs.getString("clas"));
      out.write(" </TD>      </tr>        \n");
      out.write("            <tr> <TD><B>SUBJECT - </B></TD><TD> ");
      out.print( rs.getString("subject"));
      out.write(" </TD> </tr>              \n");
      out.write("            <tr><TD><B>TODAY'S ASSIGNMENT - </B></TD><TD> ");
      out.print( rs.getString("assgn"));
      out.write(" </TD>\n");
      out.write("            </tr>       \n");
      out.write("        </TABLE>  <BR>       \n");
      out.write("        ");
 } 
      out.write("    \n");
      out.write("    </BODY>\n");
      out.write("</HTML>");
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

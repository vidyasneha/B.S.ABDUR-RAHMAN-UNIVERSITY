package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class curr_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<body background=\"C:/background.jpg\">\n");
      out.write("<br>\n");
      out.write("<center><h1><b>CURRENT NEWS</h1></b></center>\n");
      out.write("<BR>\n");
      out.write("<h1 style=\"text-align:center\">A.P.J.ABDUL KALAM MEMORIAL SCHOOL</h1><br>\n");
      out.write("<b>1.Mathematics week celebration by primary students.</b><br>\n");
      out.write("In connection with celebration of National Mathematics Day and Mathematics Week \n");
      out.write("the children of primary section participated whole heartedly with the following\n");
      out.write("programmes:<br>\n");
      out.write("<ul>\n");
      out.write("<li> 16-11-2014 - An Insight into the Life of Bhaskaracharya -> Students will brief about their pen-picture.</li>\n");
      out.write("<li>17-11-2014 - Quizzing Students -> Children of class III will conduct a quiz programme on few topics in Math.</li>\n");
      out.write("\n");
      out.write("<li>18-11-2014 - Slogans and Sayings on Mathematics -> Childrens will present slogans and rhymes with placards.</li></ul><br>\n");
      out.write("<b>2.Regional Athletic Meet will be conducted from 25.11.2015 to 28.11.2015.</b><br>\n");
      out.write("<b>3.Tritiya Sopan Testing Camp for Scouts and Guides will be held from 30.11.2012 to 28.12.2015.</b><br>\n");
      out.write("<b>4.Annual Panel Inspection will be on 06-12-15 & 07-12-15.</b><br>\n");
      out.write("<b>5.UBI Fees Collection Workshop will be on 12-12-15 for Chennai & Ernakulam Region.</b><br>\n");
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

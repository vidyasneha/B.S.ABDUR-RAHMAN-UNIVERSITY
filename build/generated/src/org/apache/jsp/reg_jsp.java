package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body background=\"C:\\Users\\lenovo\\Desktop\\ip\\background.jpg\">\n");
      out.write("<form action=\"#\" name=\"StudentRegistration\" onsubmit=\"return(validate());\">\n");
      out.write("\n");
      out.write("<table cellpadding=\"8\" width=\"40%\" background=\"C:\\Users\\lenovo\\Desktop\\ip\\background.jpg\" align=\"center\"\n");
      out.write("cellspacing=\"8\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td colspan=2>\n");
      out.write("<center><font size=4><b>Student Registration Form</b></font></center>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Name</td>\n");
      out.write("<td><input type=text name=textnames id=\"textname\" size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Father Name</td>\n");
      out.write("<td><input type=\"text\" name=\"fathername\" id=\"fathername\"\n");
      out.write("size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Postal Address</td>\n");
      out.write("<td><input type=\"text\" name=\"paddress\" id=\"paddress\" size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Personal Address</td>\n");
      out.write("<td><input type=\"text\" name=\"personaladdress\"\n");
      out.write("id=\"personaladdress\" size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Sex</td>\n");
      out.write("<td><input type=\"radio\" name=\"sex\" value=\"male\" size=\"10\">Male\n");
      out.write("<input type=\"radio\" name=\"sex\" value=\"Female\" size=\"10\">Female</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>City</td>\n");
      out.write("<td><select name=\"City\">\n");
      out.write("<option value=\"-1\" selected>select..</option>\n");
      out.write("<option value=\"New Delhi\">NEW DELHI</option>\n");
      out.write("<option value=\"Mumbai\">MUMBAI</option>\n");
      out.write("<option value=\"Goa\">GOA</option>\n");
      out.write("<option value=\"Patna\">PATNA</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Course</td>\n");
      out.write("<td><select name=\"Class\">\n");
      out.write("<option value=\"-1\" selected>select..</option>\n");
      out.write("<option value=\"VI\">VI</option>\n");
      out.write("<option value=\"VII\">VII</option>\n");
      out.write("<option value=\"VIII\">VIII</option>\n");
      out.write("<option value=\"IX\">IX</option>\n");
      out.write("<option value=\"x\">X</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>District</td>\n");
      out.write("<td><select name=\"District\">\n");
      out.write("<option value=\"-1\" selected>select..</option>\n");
      out.write("<option value=\"Nalanda\">NALANDA</option>\n");
      out.write("<option value=\"UP\">UP</option>\n");
      out.write("<option value=\"Goa\">GOA</option>\n");
      out.write("<option value=\"Patna\">PATNA</option>\n");
      out.write("</select></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>State</td>\n");
      out.write("<td><select Name=\"State\">\n");
      out.write("<option value=\"-1\" selected>select..</option>\n");
      out.write("<option value=\"New Delhi\">NEW DELHI</option>\n");
      out.write("<option value=\"Mumbai\">MUMBAI</option>\n");
      out.write("<option value=\"Goa\">GOA</option>\n");
      out.write("<option value=\"Bihar\">BIHAR</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>PinCode</td>\n");
      out.write("<td><input type=\"text\" name=\"pincode\" id=\"pincode\" size=\"30\"></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>EmailId</td>\n");
      out.write("<td><input type=\"text\" name=\"emailid\" id=\"emailid\" size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>DOB</td>\n");
      out.write("<td><input type=\"text\" name=\"dob\" id=\"dob\" size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>MobileNo</td>\n");
      out.write("<td><input type=\"text\" name=\"mobileno\" id=\"mobileno\" size=\"30\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"reset\"></td>\n");
      out.write("<td colspan=\"2\"><input type=\"submit\" value=\"Submit Form\" /></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
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

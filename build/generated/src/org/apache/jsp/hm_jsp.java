package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title><centre><h3>A.P.J.ABDUL KALAM MEMORIAL SCHOOL<centre></h3></title> \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body background=\"C:/background.jpg\">\n");
      out.write("<img src=\"C:/schoolphoto.jpg\"alt=\"\"width=\"1400\"height=\"400\">\n");
      out.write("<h1 style=\"text-align:center\">A.P.J.ABDUL KALAM MEMORIAL SCHOOL</h1>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/* Derived from http://www.devinrolsen.com/pure-css-horizontal-menu/ */\n");
      out.write("\n");
      out.write("#pagebody { position: inherit !important; width: 100%; } /* DO NOT EDIT */\n");
      out.write("#pagebody-inner { position: inherit !important; width: 100%; } /* DO NOT EDIT */\n");
      out.write("\n");
      out.write("#alpha, #beta, #gamma, #delta {\n");
      out.write("    display: inline; /* DO NOT EDIT */\n");
      out.write("    position: inherit !important; /* DO NOT EDIT */\n");
      out.write("    float: left; /* DO NOT EDIT */\n");
      out.write("    min-height: 1px; /* DO NOT EDIT */\n");
      out.write("}\n");
      out.write("\n");
      out.write("#centernav {\n");
      out.write("  width: 900px; /* if you want your nav centered, set this to the width of your container, if you don't want it centered, change this number to 100% */\n");
      out.write("  margin-left: auto ;\n");
      out.write("  margin-right: auto ;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#dropnav \n");
      out.write("{height:25px; background:#999;} /* Changes the height and bg color of the main menu */\n");
      out.write("\n");
      out.write("#dropnav ul\n");
      out.write("{margin:0px; padding:0px;}\n");
      out.write("\n");
      out.write("#dropnav ul li\n");
      out.write("{display:inline; float:left; list-style:none; margin-left:20px; position:relative; height:50px; width:200px;} /* only edit the last 2 items - sets the width of the main menu */\n");
      out.write("\n");
      out.write("#dropnav li a\n");
      out.write("{color:#FFF; text-decoration:none;} /* Changes the link color of items on the main menu */\n");
      out.write("\n");
      out.write("#dropnav li a:hover\n");
      out.write("{color:#900; text-decoration:none;}/* Changes the hover color of items on the main menu */\n");
      out.write("\n");
      out.write("#dropnav li ul\n");
      out.write("{margin:0px; padding:0px; display:none; position:absolute; left:0px; z-index: 99; top:25px; background-color:#ccc;} /* Only edit the last 2 items - set the top margin and background color of the submenus */\n");
      out.write("\n");
      out.write("#dropnav li:hover ul\n");
      out.write("{display:block; width:210px;} /* sets the width of the submenus */\n");
      out.write("\n");
      out.write("#dropnav li li\n");
      out.write("{list-style:none; display:list-item;} /* DO NOT EDIT */\n");
      out.write("\n");
      out.write("#dropnav li li a\n");
      out.write("{color:#000; text-decoration:none;} /* Changes the link color of items in the submenu */\n");
      out.write("\n");
      out.write("#dropnav li li a:hover\n");
      out.write("{color:#900; text-decoration:none;} /* Changes the hover color of items in the submenu */\n");
      out.write("\n");
      out.write("li#main  {padding-top: 5px;} /* Sets the padding of items in the main menu */\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    <div id=\"centernav\">\n");
      out.write("    <div id=\"dropnav\">\n");
      out.write("        <ul>\n");
      out.write("\n");
      out.write("            <li id=\"main\">\n");
      out.write("            <a href=\"#\">HOME</a>\n");
      out.write("                <ul id=\"subnav\">\n");
      out.write("                    <li><a href=\"cont.jsp\">CONTACT US</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li id=\"main\">\n");
      out.write("            <a href=\"#\">ADMINISTRATOR</a>\n");
      out.write("                <ul id=\"subnav\">\n");
      out.write("                      <li><a href=\"adm2.jsp\">ADMISSION FORM</a></li>\n");
      out.write("                      <li><a href=\"fee.jsp\">FEE STRUCTURE</a></li>\n");
      out.write("                      <li><a href=\"fed.jsp\">FEEDBACK FORM</a></li>\n");
      out.write("                </ul>            \n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li id=\"main\">\n");
      out.write("            <a href=\"#\">STUDENTS POTAL</a>\n");
      out.write("                <ul id=\"subnav\">\n");
      out.write("             <li><a href=\"elg.jsp\">EXAM LOGIN</a></li>\n");
      out.write("             <li><a href=\"chkassgn.jsp\">CHECK ASSIGNMENTS</a></li>\n");
      out.write("                </ul>            \n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li id=\"main\">\n");
      out.write("            <a href=\"#\">PARENTS PORTAL</a>\n");
      out.write("\n");
      out.write("                <ul id=\"subnav\">\n");
      out.write("                      <li><a href=\"curr.jsp\">CURRENT NEWS</a></li>\n");
      out.write("                      <li><a href=\"parents.jsp\">CHECK YOUR WARD DETAILS</a></li>\n");
      out.write("                </ul>            \n");
      out.write("            </li>\n");
      out.write("        </ul>    \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<P><h1>INTRODUCTION</h1></p>\n");
      out.write("<p>The A.P.J.ABDUL KALAM MEMORIAL SCHOOL School educates professionals qualified to meet the challenges of the information society. The ability to generate, access, and use information has become the key factor in personal, social, and economic growth. The expanding global information society requires the free flow of information; and the impact of rapidly changing information and communications technologies is reshaping our personal, educational, and social activities, our organizational and political practices, and our local, national, and international institutions.\n");
      out.write("\n");
      out.write("Roles, responsibilities, and career opportunities for professionals who can function as creative, information resource managers; act as culturally sensitive guides, navigators and interpreters for local and global users; and produce customized, culturally relevant, value-added services and products for diverse clienteles are expanding.\n");
      out.write("\n");
      out.write("These professionals will play an increasingly vital role in empowering individuals, organizations, and communities to maximize the benefits of the information age.\n");
      out.write("\n");
      out.write("Through a forward-looking curriculum and diverse learning environments, the School prepares graduates who have the knowledge, skills, and attitudes necessary to be ethical, culturally aware, and transformative leaders.</p>\n");
      out.write("<p><h1>VISION</h1></p>\n");
      out.write("<p>\n");
      out.write("Envisions a global society in which information resources are created, protected, managed, and used for the good of society, including addressing challenges and opportunities in the service of equity and productivity for individuals and communities.</p>\n");
      out.write("<p><h1>MISSION</h1></p>\n");
      out.write("<p>to provide excellence in education, preparing leaders for a diverse, highly technological, information-based global society; to engage in research and creative activities that generate new knowledge and applications for effective practice and that foster interdisciplinary approaches to address information challenges; and to meet the complex information needs of society through public and professional service.</P>\n");
      out.write("<p><h1>THE SCHOOL'S GOALS AND OBJECTIVES</h1></p>\n");
      out.write("<ul>\n");
      out.write("<li>Educate students at the graduate professional and postgraduate levels to provide information services and products to a pluralistic society.</li>\n");
      out.write("<li> Provide a broadly-based liberal arts education at the undergraduate level that will prepare students for careers in organizational settings in an information-based, pluralistic, global society.</li>\n");
      out.write("<li>articipate in and promote research, scholarship, and creative activities.</li>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<embed src=\"C:\\school.mp4\" height = \"350\" width=\"500\" autostart=\"false\"></embed>\n");
      out.write("</center>\n");
      out.write("<center>\n");
      out.write("<img src=\"C:\\motto.jpg\"alt=\"\"width=\"600\"height=\"400\">\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("\n");
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

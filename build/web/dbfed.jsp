<%@ page import ="java.sql.*" %>
<%
    String name = request.getParameter("name");    
    String rollno = request.getParameter("rollno");
    String mailid = request.getParameter("mailid");
    String comment = request.getParameter("comment");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/school",
            "sneha", "jasmine");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into fedtb (name,rollno,mailid,comment) values ('"+name+"','"+rollno+"','"+mailid+"','"+comment+"')");
    if (i > 0) {
       
        response.sendRedirect("hm.jsp");
       
    } else {
        response.sendRedirect("lg.jsp");
    }
%>
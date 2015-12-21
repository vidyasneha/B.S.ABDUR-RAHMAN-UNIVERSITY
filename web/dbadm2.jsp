<%@ page import ="java.sql.*" %>
<%
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/school",
            "sneha", "jasmine");
    String fname = request.getParameter("fname"); 
    String lname = request.getParameter("lname");
    String gender = request.getParameter("gender");
    String dob = request.getParameter("dob");
    String age = request.getParameter("age");
    String par = request.getParameter("par"); 
    String addr = request.getParameter("addr");
    String cont = request.getParameter("cont");
    String email = request.getParameter("email");
    String trans = request.getParameter("trans");
    String query = "insert into admtb2 (fname,lname,gender,dob,age,par,addr,cont,email,trans) values (?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement ps = con.prepareStatement(query);
     ps.setString(1,fname);
     ps.setString(2,lname);
     ps.setString(3,gender);
     ps.setString(4,dob);
     ps.setString(5,age);
     ps.setString(6,par);
     ps.setString(7,addr);
     ps.setString(8,cont);
     ps.setString(9,email);
     ps.setString(10,trans);
    int i = ps.executeUpdate();
    if (i != 0) {
       
        response.sendRedirect("hm.jsp");
       
    } else {
        response.sendRedirect("lg.jsp");
    }
%>
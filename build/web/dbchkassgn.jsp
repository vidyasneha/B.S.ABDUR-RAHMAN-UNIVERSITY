<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<HTML>    
    <HEAD>        
        <TITLE>Assignments</TITLE>    
    </HEAD>    
    <BODY background="C:/background.jpg">    <CENTER>    
        <H1>ASSIGNMENTS FOR TODAY</H1>  <BR><BR><BR>      
        <% Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/school", "sneha", "jasmine");            
           Statement statement = connection.createStatement();            
           String clas = request.getParameter("clas"); 
           String subject = request.getParameter("subject");
           ResultSet rs = statement.executeQuery("select *from chkassgntb where clas = '" + clas + "' and subject = '" + subject + "'");             
           if(!rs.next()) {                 
           out.println("Sorry, could not find that publisher. ");  } 
           else {         
        %>        
        <TABLE BORDER="10" cellspacing='10' cellpadding='12'>    <center>        
            <tr></tr><tr></tr>
            <TR>               
                <td><B>CLASS  </B></TD><TD> <%= rs.getString("clas")%> </TD>      </tr>
            <tr></tr><tr></tr>
            <tr> <TD><B>SUBJECT  </B></TD><TD> <%= rs.getString("subject")%> </TD> </tr>
            <tr></tr><tr></tr>
            <tr><TD><B>TODAY'S ASSIGNMENT  </B></TD><TD> <%= rs.getString("assgn")%> </TD>
            </tr>       
        </TABLE>  <BR>       
        <% } %>    
    </BODY>
</HTML>
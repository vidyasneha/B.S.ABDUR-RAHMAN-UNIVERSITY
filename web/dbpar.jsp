<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<HTML>    
    <HEAD>        
        <TITLE>Details</TITLE>    
    </HEAD>    
    <BODY background="C:/background.jpg">    <CENTER>    
        <H1>DETAILS OF YOUR WARD</H1>  <BR><BR><BR>      
        <% Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/school", "sneha", "jasmine");            
           Statement statement = connection.createStatement();            
           String rollno = request.getParameter("rollno");              
           ResultSet rs = statement.executeQuery("select *from partb where rollno = '" + rollno + "'") ;             
           if(!rs.next()) {                 
           out.println("Sorry, could not find that publisher. ");  } 
           else {         
        %>        
        <TABLE BORDER="1">            
            <TR>               
                <TH>ROLL NUMBER</TH>               
                <TH>NAME</TH>               
                <TH>ENGLISH</TH>
                <TH>MATHS</TH>
                <TH>SCIENCE</TH>
                <TH>OVERALL MARKS</TH>
                <TH>OVERALL ATTENDANCE</TH>
            </TR>           
            <TR>               
                <TD> <%= rs.getString("rollno")%> </TD>               
                <TD> <%= rs.getString("name")%> </TD>               
                <TD> <%= rs.getString("eng")%> </TD>
                <TD> <%= rs.getString("mat")%> </TD>
                <TD> <%= rs.getString("sci")%> </TD>
                <TD> <%= rs.getString("overm")%> </TD>
                <TD> <%= rs.getString("overa")%> </TD>
            </TR>       
        </TABLE>  <BR>       
        <% } %>    
    </BODY>
</HTML>
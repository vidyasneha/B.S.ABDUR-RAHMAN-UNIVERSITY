<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<HTML>    
    <HEAD>        
        <TITLE>Result</TITLE>    
    </HEAD>    
    <BODY background="C:/background.jpg">    <CENTER>    
        <H1>EXAM RESULTS</H1>  <BR><BR><BR>      
        <% Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/school", "sneha", "jasmine");            
           Statement statement = connection.createStatement();            
           String username = request.getParameter("username"); 
           String pass = request.getParameter("pass");
           ResultSet rs = statement.executeQuery("select *from elgtb where username = '" + username + "' and pass = '" + pass + "'"); ;             
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
            </TR>           
            <TR>               
                <TD> <%= rs.getString("username")%> </TD>               
                <TD> <%= rs.getString("pass")%> </TD>               
                <TD> <%= rs.getString("eng")%> </TD>
                <TD> <%= rs.getString("mat")%> </TD>
                <TD> <%= rs.getString("sci")%> </TD>
                <TD> <%= rs.getString("overm")%> </TD>
            </TR>       
        </TABLE>  <BR>       
        <% } %>    
    </BODY>
</HTML>
<%-- 
    Document   : adm2
    Created on : Nov 20, 2015, 9:30:38 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admission Form</title>
    </head>
    <body BACKGROUND="C:\background.jpg"><CENTER>
        <h3>ADMISSION FORM</h3>
        <form method="post" action="dbadm2.jsp">
            <table border='0'>

 <tr>

  <td><LABEL for="fname">First Name:<sup style="color:#F00">*</sup> </LABEL></td>

         <td><INPUT type="text" name="fname"></td>

 </tr>

 <tr>

  <td><LABEL for="lname">Last Name:<sup style="color:#F00">*</sup> </LABEL></td>

  <td><INPUT type="text" name="lname"></td>

 </tr>

 <tr>

   <td><LABEL for="gender">Gender:<sup style="color:#F00">*</sup> </LABEL></td> <td><INPUT type="radio" name="gender" value="male"> Male

   <INPUT type="radio" name="gender" value="female"> Female </td>

 </tr>
 <tr>

     <td><label  for="dob">Date of Birth:<sup style="color:red">*</sup> </label></td>
     <td><input type="text" name="dob" title="dd/mm/yyyy"/></td>
 </tr>
 <tr>
     <td><label for="age">Age:</label></td>
     <td><input type="text" name="age"></td>
 </tr>
  <tr>

  <td><LABEL for="par">Parent/Guardian Name:<sup style="color:red;">*</sup> </LABEL></td>

  <td><INPUT type="text" name="par"></td>

 </tr>

 <tr>

  <td><LABEL for="addr" style="text-align:left;">Address:<sup style="color:#F00">*</sup> </LABEL></td>

  <td><textarea   name="addr" rows="4" cols="20"></textarea>  

  </td>

 </tr>
 
 <tr>

  <td><LABEL for="cont">Contact Number:<sup style="color:#F00">*</sup> </LABEL></td>

  <td><INPUT type="text" name="cont"></td>

 </tr>

 <tr>

  <td><LABEL for="email">Email:<sup style="color:red;">*</sup> </LABEL></td>

  <td><INPUT type="text" name="email"></td>

 </tr>
 
  <tr>

   <td><LABEL for="trans">Do you want to request 
transportation services
 for the student:<sup style="color:#F00">*</sup> </LABEL></td> <td><INPUT type="radio" name="trans" value="yes"> Yes

   <INPUT type="radio" name="trans" value="no"> No</td>

 </tr>
 
 <tr> 
 <td></td><td><br/>
      <input type="submit" value="Submit" onclick="alert('Submitted successfully')"/>
  <INPUT type="reset" onClick="return confirmreset()"></td>

 </tr>
 
 <tr>

  <td></td><td style="font-size:8px;text-align:right;"><br/><i style="color:red;font-size:12px;align:right;" >* - Mandatory</i></td>

 </tr>
        
        </form>
    </body>
</html>

<%@
page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Aikyam Login</title>
    <link rel="icon" href="./signup/favicon.ico">
    <link rel="stylesheet" href="./signup/styles.css">  
    <!-- <script type="text/javascript">
     function validate(){
        var status=document.getElementById("status").value;
    if(status=="success")
    {
        alert("Congrats, You are now the member of Aikyam");
    }
    if(status=="invalidname")
    {
        alert("Please Enter Your Name");
    }
    if(status=="invalidemail")
    {
        alert("Please Enter Your email");
    }
    if(status=="invalidpwd")
    {
        alert("Please Enter Your Password");
    }
    if(status=="invalidmobile")
    {
        alert("Please Enter Your Mobile");
    }
    if(status=="invalidmobilelength")
    {
        alert("Please Enter Valid Mobile Number");
    }
    if(status=="invalidrpwd")
    {
        alert("Password do not match");
    }
     }
</script>  -->
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
    <div class = "hero">
    <img src="./signup/AikyamLogo.png" alt="Aikyam" class="Aikyam">
    <div class="form">
    <form method="post" action="RegistrationServlet" class="box">
        <input type="text" name="username" placeholder="Enter Full Name" id="username" required="required">
        <input type="email" name="uemail" placeholder="Enter Gmail" id="uemail" required="required">
        <input type="password" name="password" placeholder="Enter password" id="password" required="required">
        <input type="password" name="rpassword" placeholder="Repeat password" id="rpassword" required="required">
        <input type="number" name="umobile" placeholder="Enter mobile number" id="umobile" required="required"> 
        <input type="submit" name="signup" value="signup" onclick="validate()"/>
        </form>
        </div>
        <p class="signup">Already have a account?<a href="login.jsp" style="color: #ff0000;"> Log In </a></p>
    </div>
   <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
    <script type="text/javascript">
    var status = document.getElementById("status").value;
    if(status=="success"){
    	swal("Congrats","You are now the member of Aikyam","success");
    }
    if(status=="invalidname"){
    	swal("Failed","Please Enter Your Name","error");
    }
    if(status=="invalidemail"){
    	swal("Failed","Please Enter Your email","error");
    }
    if(status=="invalidpwd"){
    	swal("Failed","Please Enter Your Password","error");
    }
  
    if(status=="invalidmobile"){
    	swal("Failed","Please Enter Your Mobile","error");
    }
    if(status=="invalidmobilelength"){
    	swal("Failed","Please Enter Valid Mobile Number","error");
    }
    if(status=="invalidrpwd"){
    	swal("Failed","Password do not match","error");
    }
    </script>
    

    
</body>
</html>
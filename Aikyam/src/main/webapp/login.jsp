<%@
page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Aikyam Login</title>
    <link rel="icon" href="./login/favicon.ico">
    <link rel="stylesheet" href="./login/styles.css">  

</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
    <div class = "hero">
    <img src="./login/AikyamLogo.png" alt="Aikyam" class="Aikyam">
    <div class="form">
    <form method="post" action="login" class="box">
        <input type="email" name="uemail" placeholder="Enter Email" id="uemail" required="required">
        <input type="password" name="password" placeholder="Enter password" id="password" required="required">
     <div class="container">  <label class ="cbox" > remember me
        <input type="checkbox" >
        </label>
     </div>
        <input type="submit" name="" value="Login" onclick="validate()">
        </form>
        </div>
        <p class="signup">Didn't have a account?<a href="signup.jsp" style="color: #ff0000;"> Sign UP </a></p>
    </div>
 <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
   <script type="text/javascript">
    var status = document.getElementById("status").value;
    if(status=="failed"){
    	swal("Sorry","Wrong Username and Password","error");
    }
    if(status=="invalidemail"){
    	swal("Invalid","Please Enter Valid email","error");
    }
    if(status=="invalidpwd"){
    	swal("Invalid","Please Enter Valid Password","error");
    }
    </script> 

</body>
</html>
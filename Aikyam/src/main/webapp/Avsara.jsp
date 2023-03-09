<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="icon" href="./login/favicon.ico">
   

</head>
<body>
<%@ include file="nav.jsp" %>
<!--nav start -->

<!-- <nav >
        <div class="navbar">
        <div class="logo">
            <img src="aikyamlogo.png" alt="logo" class="aiklogo">
        </div>





        <div class="col2">
             
           <form action="">
            <input type="text" placeholder="Ask your doubt " class="searchbar">
        </form>
    
           <button type="submit" class="submits"><b>Ask</b></button>
        </div>



        
       <div class="option">
        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">Gurukul</a></li>
            <li><a href="#">Avsar</a></li>
            <li><a href="#">About Us</a></li>
            <li><a href="#">Contact Us</a></li>
        </ul>
    </div> 
    <div class="profile">
        <button type="submit" class="SLogIn"><b>LogIn</b> </button>
    </div>
</div>
    </nav> -->

<!--nav End -->
    <header>
        <!-- <h1 class="heading" style="color: white;">AIK<span style="color: red;">YAM</span></h1>
        <div class="navbar">  -->
        <nav>
            <ul class="nav_links">
            <li><a href="FrontPage.jsp">AIKYAM</a> </li>
            <li><a href="Gurukul.jsp">Gurukul</a></li>
            <li><a href="Avsara.jsp" style ="font-style: oblique;">Avs<span style="color: red;">ara</span></a></li>
            <li><a href="Alumni.jsp">Alumni</a></li>
            <li><a href="Contact.jsp">Contact</a></li>
            <li class="nav-item mx-0 mx-Lg-1"><a
            class="nav-link py-3 px-0 px-Lg-3 rounded" href="Logout">Logout</a></li>
             <li class="nav-item mx-0 mx-Lg-1 bg-danger"><a
            class="nav-link py-3 px-0 px-Lg-3 rounded" href=""><%=session.getAttribute("username") %></a></li>
            </ul>
        </nav>
        </div>
    </header>
</body>
</html>
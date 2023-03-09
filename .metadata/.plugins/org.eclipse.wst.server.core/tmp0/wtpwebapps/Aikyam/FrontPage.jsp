

<%
    if((session.getAttribute("username")==null) ){
	response.sendRedirect("login.jsp");
}
%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport"
           content ="width=device, initial-scale=1, shrink-to-fit=no"/>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="icon" href="./login/favicon.ico">
   

</head>
<body>
<%@ include file="nav.jsp" %>
    <header>
        <!-- <h1 class="heading" style="color: white;">AIK<span style="color: red;">YAM</span></h1> -->
        <div class="navbar">
        <nav>
            <ul class="nav_links">
            <li><a href="FrontPage.jsp" style ="font-style: oblique;" >AIK<span style="color: red;">YAM</span></a> </li>
            <li><a href="Gurukul.jsp">Gurukul</a> </li>
            <li><a href="Avsara.jsp">Avsara</a></li>
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
        <div class = "Heading">
           <h1 style="color: white; text-align: center;">AIK<span style="color: red;">YAM</span></h1>
        </div>
        <div class="form">
            <form action="">
                <input class="input" type="search" placeholder="Search Your Doubt">
                <button class="submit" type="submit" placeholder="search">Search</button>
            </form>
        </div>
</body>
</html>
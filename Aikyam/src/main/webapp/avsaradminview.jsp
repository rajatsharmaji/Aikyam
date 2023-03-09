<%@page import="com.aikyam.avsar.JobDao" %>
<%@page import="com.aikyam.avsar.Jobs" %>
<%@page import="java.util.List" %>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/avsaradminview.css ">
  
    <title>Avsar</title>
</head>
<body>

   <%@ include file="navadmin.jsp" %>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">


    <header>
        <h1>AV<span style="color: red;">SAR</span></h1>
      </header>
    <nav class="navbar4">
       
        <div class="navbar4-menu">
             <a href="./avsarjobpost.jsp">Post Job</a>
             <a href="./avsaradminview.jsp">View Job</a>
         </div>
     </nav>
      <main>
      
      <%
     JobDao dao= new JobDao();
     List<Jobs> list=dao.getAllJobs();
     for(Jobs j:list)
     {%>
  <section class="job-listing">
          <h2><%=j.getjob_profile() %></h2>
          <p><%=j.getlocation() %> | <%=j.getcategory() %></p>
          <p> <%=j.getstatus() %> | <%=j.getdescription() %></p>
          <br>
          <p ><a href="./avsarjobpost.jsp">Edit</a></p>
          
        </section>
     <%}

%>
      </main>

</body>
</html>
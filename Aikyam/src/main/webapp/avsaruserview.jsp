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

   <%@ include file="nav.jsp" %>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">


    <header>
        <h1>AV<span style="color: red;">SAR</span></h1>
      </header>
      <main>
      
      <%
     JobDao dao= new JobDao();
     List<Jobs> list=dao.getAllJobs();
     for(Jobs j:list)
     {%>
  <section class="job-listing">
          <h2><%=j.getjob_profile() %></h2>
          <p><%=j.getdescription() %></p>
          <p>Location: <%=j.getlocation() %></p>
          <p>Category: <%=j.getcategory() %></p>
          <p>Status: <%=j.getstatus() %></p>
          <p><a href="">Apply Now</a></p>
          
        </section>
     <%}

%>
      </main>

</body>
</html>
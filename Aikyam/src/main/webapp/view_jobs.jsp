<%@page import="com.aikyam.avsar.JobDao" %>
<%@page import="com.aikyam.avsar.Jobs" %>
<%@page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/viewjobs.css">
<title>Admin: view jobs</title>
</head>
<body style="background-color: hsl(0, 0%, 0%);">
<%@ include file="navadmin.jsp" %>
<div class="container9">
<div class="row9">
<div class="typejob">
<h5 class="hdng1">All jobs</h5>


<%
     JobDao dao= new JobDao();
     List<Jobs> list=dao.getAllJobs();
     for(Jobs j:list)
     {%>
     
     <div class="card mt-2">
<div class="card-body9">
<div class="text-center text-primary">
<i class="far fa-clipboard fa-2x"></i>
</div>

<h6 class="hdng2"><%=j.getjob_profile() %></h6>
<h6 class="hdng2"><%=j.getdescription() %></h6>
<br>
<div class="form-row">
<div class="form-group col-md-3">
<input type="text" class="locate9" value="Location:<%=j.getlocation() %>" readonly>
</div>
<br>
<div class="form-group col-md-3">
<input type="text" class="category9" value="Category:<%=j.getcategory() %>" readonly>
</div>
<br>
<div class="form-group col-md-3">
<input type="text" class="status9" value="Status:<%=j.getstatus() %>" readonly>
</div>
<br>
</div>
<div class="text-center">
<a href="#" class="edit9">Edit</a>
<br>
<a href="#" class="del9">Delete</a>
</div>

</div>
</div>
     
     <%}

%>


</div>
</div>
</div>

</body>
</html>
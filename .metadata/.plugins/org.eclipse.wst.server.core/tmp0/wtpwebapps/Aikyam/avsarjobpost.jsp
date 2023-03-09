<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="./css/avsarjobpost.css">
    <title>avsar</title>
</head>
<body style="background-color: #000000;">
<%@ include file="navadmin.jsp" %>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">

<div class="all">
    
    <form method="post" action="addjob" class="job">





       <div class="job1">
        <h4 class="hdng">Job Profile</h4>  
             <input type="text" placeholder="Enter Job Profile" class="addjob" name="Jobtitle" required="required">
        </div>




         <div class="job2">
            <h4 class="hdng">Location</h4>  
                
            <label for="Location" ></label>
                 <select class="Location" name="Location">
                    <option value="Banglore">Banglore</option>
                    <option value="Delhi">Delhi</option>
                    <option value="Pune">Pune</option>
                    <option value="Hyderabad">Hyderabad</option>
                  </select>
             
           
            
             <h4 class="hdng">Category</h4>  
                  
            <label for="Category"></label>
            <select class="Category" name="Category">
               <option value="IT">IT</option>
               <option value="CS">cs</option>
               <option value="ELECTRONIC">ELECTRONIC</option>
               
             </select>
                
            </div>



            <div class="job3">
             <h4 class="hdng">Status</h4> 
             <label for="Status"></label>
             <select class="Status" name="Status">
                <option value="Active">Full-time</option>
                <option value="In-Active">Part-time</option>
               
                
              </select> 
                
             

             
             <h4 class="hdng">Enter Description</h4>  
                 <input type="text" placeholder="Enter Description about job" class="EnterDescription" name="EnterDescription" required="required">
             
            </div>



            <div class="job4">
             <input type="submit" class="UpdateJob" name="UpdateJob" value="UpdateJob"/>
            </div>
            </form>
            <div class="nothing"></div>
            </div>
            
     <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
    <script type="text/javascript">
    var status = document.getElementById("status").value;
    if(status=="success"){
    	swal("Congrats","Job Posted Successfully","success");
    }
    </script>
   
 <%@ include file="footer.jsp" %>

</body>

</html>
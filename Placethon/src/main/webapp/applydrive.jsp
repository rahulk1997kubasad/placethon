<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Drives</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<style>
.main_content{
  width: 85%;
  margin-left: 200px;
}
.main_content .header{
  padding: 20px;
  background: #fff;
  color: #717171;
  border-bottom: 1px solid #e0e4e8;
}

.main_content .info{
  margin: 20px;
  color: #717171;
  line-height: 25px;
}

.main_content .info div{
  margin-bottom: 20px;
}
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}
</style>
</head>
<body>
	<jsp:include page="nav1.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
       
        <form action="ShowAllDrivesServlet" method="get">
        <button type="submit" class="btn btn-primary">Show Drives</button>
    		<table>
    			<tr>
    			<th>Drive Description</th>
    			<th>Drive Location</th>
    			<th>Company Name</th>
    			<th>CTC</th>
    			<th>Action</th>
    			</tr>
    			<tbody>
    			<c:forEach var="drives1" items="${drives}"  >
        			<tr>
            		<td><c:out value="${drives1.drivedesc}"/></td>
    				<td><c:out value="${drives1.drivelocation}"/></td>
    				<td><c:out value="${drives1.companyname}"/></td>
    				<td><c:out value="${drives1.CTC}"/></td>
    				<td><a href="Showsingledriveservlet?driveid=<c:out value='${drives1.driveid}'/>">Check</a></td>
    			</tr>
    			</c:forEach>
    			</tbody>
    		</table>
    		</form>

        </div>
    </div>
</body>
</html>
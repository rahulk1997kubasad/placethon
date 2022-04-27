<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="adminnav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
        	<div class="card" style="width: 60srem;">
       		<h3 style="text-align:center;">Candidate Details</h3>
  			<div class="card-body">
  			<form action="Editstubyadminservlet" method="get">
    			<div>
    				<table>
    			<tr>
    			<th>ID</th>
    			<th>Name</th>
    			<th>Email</th>
    			<th>Mobile</th>
    			<th>Status</th>
    			<th>Actions</th>
    			</tr>
    			<tbody>
    			<c:forEach var="studentdetailstoadmin" items="${studentdetailstoadmin}" >
        			<tr>
        			<td><c:out value="${studentdetailstoadmin.stuid}"/></td>
            		<td><c:out value="${studentdetailstoadmin.stufullname}"/></td>
    				<td><c:out value="${studentdetailstoadmin.stuemail}"/></td>
    				<td><c:out value="${studentdetailstoadmin.stumobile}"/></td>
    				 <td><c:out value="${studentdetailstoadmin.stustatus}"/></td>
    				 <td><a href="EditsinglestubyadminServlet?stuid=<c:out value='${studentdetailstoadmin.stuid}'/>">Edit</a>
    				 	<a href="Showsingledriveservlet?stuid=<c:out value='${studentdetailstoadmin.stuid}'/>">Disable/Enable</a>
    				 </td>
    				</tr>
    			</c:forEach>
    			</tbody>
    		</table>
    		
    			</div>
    			<button type="submit" class="btn btn-primary">Show Candidates</button>
    			</form>
  			</div>
  
		</div>
        	
		</div>
    </div>
</body>
</html>
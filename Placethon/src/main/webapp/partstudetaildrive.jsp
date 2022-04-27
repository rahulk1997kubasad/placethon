<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Candidate details of Particular Drive</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
       <div class="card" style="width: 60srem;">
       		<h3 style="text-align:center;">Candidate Details</h3>
  			<div class="card-body">
    			<div>
    				<table>
    			<tr>
    			<th>Candidate Name</th>
    			<th>Candidate Email</th>
    			<th>Candidate Mobile</th>
    			<th>Drive Link of Resume</th>
    			</tr>
    			<tbody>
    			<c:forEach var="stulistofpardrive" items="${stulistofpardrive}" >
        			<tr>
            		<td><c:out value="${stulistofpardrive.stufullname}"/></td>
    				<td><c:out value="${stulistofpardrive.stuemail}"/></td>
    				<td><c:out value="${stulistofpardrive.stumobile}"/></td>
    				 <td><c:out value="${stulistofpardrive.linkforresume}"/></td>
    				</tr>
    			</c:forEach>
    			</tbody>
    		</table>
    		<p><b>${result}</b></p>
    			</div>
  			</div>
		</div>
		</div>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home</title>
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
</style>
</head>
<body>

	<jsp:include page="nav1.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
        	<div>
        		<b>WELCOME ${stu.stufullname} (${stu.stuemail})</b>
				
			</div>
          <div>Lorem ipsum dolor sit, amet consectetur adipisicing elit. A sed nobis ut exercitationem atque accusamus sit natus officiis totam blanditiis at eum nemo, nulla et quae eius culpa eveniet voluptatibus repellat illum tenetur, facilis porro. Quae fuga odio perferendis itaque alias sint, beatae non maiores magnam ad, veniam tenetur atque ea exercitationem earum eveniet totam ipsam magni tempora aliquid ullam possimus? Tempora nobis facere porro, praesentium magnam provident accusamus temporibus! Repellendus harum veritatis itaque molestias repudiandae ea corporis maiores non obcaecati libero, unde ipsum consequuntur aut consectetur culpa magni omnis vero odio suscipit vitae dolor quod dignissimos perferendis eos? Consequuntur!</div>
      </div>
    </div>

	
</body>
</html>
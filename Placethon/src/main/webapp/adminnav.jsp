<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
@import url('https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap');

*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style: none;
  text-decoration: none;
  font-family: 'Josefin Sans', sans-serif;
}

body{
   background-color: #f3f5f9;
}

.wrapper{
  display: flex;
  position: relative;
}

.wrapper .sidebar{
  width: 200px;
  height: 100%;
  background: #4b4276;
  padding: 30px 0px;
  position: fixed;
}

.wrapper .sidebar h3{
  color: #fff;
  text-transform: uppercase;
  text-align: center;
  margin-bottom: 20px;
}

.wrapper .sidebar ul li{
  padding: 15px;
  border-bottom: 1px solid #bdb8d7;
  border-bottom: 1px solid rgba(0,0,0,0.05);
  border-top: 1px solid rgba(255,255,255,0.05);
}    

.wrapper .sidebar ul li a{
  color: #bdb8d7;
  display: block;
}

.wrapper .sidebar ul li a .fas{
  width: 25px;
}

.wrapper .sidebar ul li:hover{
  background-color: #594f8d;
}
    
.wrapper .sidebar ul li:hover a{
  color: #fff;
}
 
.wrapper .sidebar .social_media{
  position: absolute;
  bottom: 0;
  left: 50%;
  transform: translateX(-50%);
  display: flex;
}

.wrapper .sidebar .social_media a{
  display: block;
  width: 40px;
  background: #594f8d;
  height: 40px;
  line-height: 45px;
  text-align: center;
  margin: 0 5px;
  color: #bdb8d7;
  border-top-left-radius: 5px;
  border-top-right-radius: 5px;
}




.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}

@media (max-height: 500px){
  .social_media{
    display: none !important;
  }
}
</style>
</head>
<body>
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	<div class="wrapper">
    <div class="sidebar">
    <img alt="Placethon" src="images/placethon.png" class="center" style="margin:auto; width:70px;"><br>
        <h3>Placethon</h3>
        <ul>
            <li><a href="adminhome.jsp"><i class="fas fa-home"></i>Home</a></li>
            <li><a href="Addstufromadmin.jsp"><i class="fas fa-user"></i>Add Candidate</a></li>
            <li><a href="Editstudentbyadmin.jsp"><i class="fas fa-address-card"></i>Edit Candidate</a></li>
            <li><a href=""><i class="fas fa-project-diagram"></i>Add Recruiter</a></li>
            <li><a href=""><i class="fas fa-blog"></i>Edit Recruiter</a></li>
            <li><a href=""><i class="fas fa-address-book"></i>Log Out</a></li>
        </ul> 
        <div class="social_media">
          <a href="#"><i class="fab fa-facebook-f"></i></a>
          <a href="#"><i class="fab fa-twitter"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
      </div>
    </div>
    
    </div>
</body>
</html>
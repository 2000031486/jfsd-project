<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>

<h1 align=center>AIRLINE RESERVATION SYSTEM</h1>

<br>

<ul>
  <li><a class="active" href="peoplehome">Home</a></li>
  <li><a href="viewallflights">Search Flights</a></li>
  <li><a href="viewpeople">View Profile</a></li>
  <li><a  href="index">Passport Details</a>
  <li><a href="peoplelogin">Logout</a></li>
</ul>

<br>

<h3 align=center>Welcome&nbsp;&nbsp;<c:out value="${euname}"></c:out></h3>

</body>
</html>

 

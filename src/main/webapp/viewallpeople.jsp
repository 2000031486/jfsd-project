<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

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
  <li><a href="adminhome">Home</a></li>
  <li><a  class="active" href="addflight">ADD FLIGHT</a></li>
  <li><a class="active"  href="viewallpeople">View People</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>People Details </u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Location</th>
<th>Email ID</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${plist}" var="emp">

<tr>

<td> <c:out value="${emp.id}"></c:out>   </td>
<td> <c:out value="${emp.name}"></c:out>   </td>
<td> <c:out value="${emp.gender}"></c:out>   </td>
<td> <c:out value="${emp.dateofbirth}"></c:out>   </td>
<td> <c:out value="${emp.location}"></c:out>   </td>
<td> <c:out value="${emp.emailid}"></c:out>   </td>
<td> <c:out value="${emp.username}"></c:out>   </td>
<td> <c:out value="${emp.contactno}"></c:out>   </td>
<td> 

<a href='<c:url value='deletepeople?id=${emp.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewempbyid?id=${emp.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 

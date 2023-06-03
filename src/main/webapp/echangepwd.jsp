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
  <li><a href="viewpeople">View Profile</a></li>
  <li><a class="active" href="echangepwd">Change Password</a></li>
  <li><a href="peoplelogin">Logout</a></li>
</ul>

<br>

<h3 align=center>Welcome&nbsp;&nbsp;<c:out value="${euname}"></c:out></h3>


<h3 align=center><u>Change Password</u></h3>

<span class="blink">
<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
</span>

<br>

<form method="post" action="updatepeoplepwd">

<table align=center>

<tr>
<td><label>Old Password</label></td>
<td><input type="password" name="oldpwd" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>New Password</label></td>
<td><input type="password" name="newpwd" required></td>
</tr>

<tr><td></td></tr>

<tr align=center>

<td colspan="2"><input type="submit" value="Update" class="button"></td>

</tr>

</table>

</form>

<br><br>
</body>
</html>

 

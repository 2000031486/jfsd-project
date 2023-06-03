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
  <li><a href="peoplehome">Home</a></li>
  <li><a class="active" href="viewallflights">Search Flights</a></li>
  <li><a href="viewpeople">View Profile</a></li>
  <li><a href="index">Passport Details</a></li>
  <li><a href="peoplelogin">Logout</a></li>
</ul>

<br>

<h3 align=center><u>Flight Details </u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>AirportName</th>
<th>ArrivelDate</th>
<th>ArrivelPlace</th>
<th>departurePlace</th>
<th>FlightNumber</th>
<th>FlightName</th>
<th>TicketPrice</th>
<th>BookTickets</th>

</tr>

<br>
<c:forEach items="${flist}" var="fli">
<tr>
<td> <c:out value="${fli.id}"></c:out>  </td>
<td> <c:out value="${fli.airportname}"></c:out>  </td>
<td> <c:out value="${fli.arriveldate}"></c:out>  </td>
<td> <c:out value="${fli.arrivalplace}"></c:out>   </td>
<td> <c:out value="${fli.departureplace}"></c:out>   </td>
<td> <c:out value="${fli.flightnumber}"></c:out>   </td>
<td> <c:out value="${fli.flightname}"></c:out>   </td>
<td> <c:out value="${fli.ticketprice}"></c:out>   </td>

<td> 

<a href='<c:url value='checkout${emp.id}'></c:url>'>Book</a>&nbsp;&nbsp;
<a href='<c:url value='viewempbyid?id=${emp.id}'></c:url>'>View</a>&nbsp;&nbsp;


</td>


</tr>
</c:forEach>

</table>
</body>
</html>
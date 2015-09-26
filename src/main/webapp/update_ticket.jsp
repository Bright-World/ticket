<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>修改</title>
</head>
<body>
	<form action="updateTicket.action?ticketNO=<%=request.getParameter("ticketNO")%>" method="post">
		FLIGHT_NO:<input type="text" name="flightNO">
		SEAT_NO:<input type="text" name="seatNO">
		<input type="submit" value="OK">
	</form>
</body>
</html>

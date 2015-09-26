<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>新增</title>
</head>
<body>
	<form action="addTicket.action" method="post">
		TICKET_NO:<input type="text" name="ticketNO">
		FLIGHT_NO:<input type="text" name="flightNO">
		SEAT_NO:<input type="text" name="seatNO">
		<input type="submit" value="OK">
	</form>
</body>
</html>

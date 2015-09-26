<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>全部票</title>
</head>
<body>
	<table style="width:100%;"cellspacing="0" cellpadding="0" border=1>
		<tr>
			<th>TICKETNO</th>
			<th>FLIGHTNO</th>
			<th>SEATNO</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
		<c:forEach items="${tickets}" var="ticket">
			<tr>
				<td><c:out value="${ticket.ticketNO}"></c:out></td>
				<td>${ticket.flightNO}</td>
				<td>${ticket.getSeatNO()}</td>
				<td><a href="update_ticket.jsp?ticketNO=${ticket.getTicketNO()}">修改</a></td>
				<td><a href="delTicket.action?ticketNO=${ticket.getTicketNO()}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

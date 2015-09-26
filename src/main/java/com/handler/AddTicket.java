package com.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.entity.Ticket;

public class AddTicket extends TicketController{
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setFlightNO(request.getParameter("flightNO"));
		ticket.setSeatNO(request.getParameter("seatNO"));
		ticket.setTicketNO(request.getParameter("ticketNO"));
		myBatisDAO.addTicket(ticket);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		return null;
	}
}

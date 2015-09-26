package com.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class DelTicket extends TicketController {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		myBatisDAO.delTicketByNO(request.getParameter("ticketNO"));
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		return null;
	}
}

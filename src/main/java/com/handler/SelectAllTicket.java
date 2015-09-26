package com.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.entity.Ticket;

public class SelectAllTicket extends TicketController{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List<Ticket> tickets = myBatisDAO.findAllTicket();
		ModelAndView modelAndView = new ModelAndView("/tickets.jsp");
		modelAndView.addObject("tickets", tickets);
		return modelAndView;
	}
}

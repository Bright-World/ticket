package com.dao;

import java.util.List;

import com.entity.Ticket;

public interface ImyBatisDAO {
	public List<Ticket> findAllTicket()throws Exception;
	public void addTicket(Ticket ticket) throws Exception;
	public void delTicketByNO(String ticketNO) throws Exception;
	public void updateTicketByNO(Ticket ticket) throws Exception;
}

package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.entity.Ticket;

public class MyBatisDAO extends SqlSessionDaoSupport implements ImyBatisDAO{
	
	public MyBatisDAO(){
		System.out.println(1);
	}
	
	@Override
	public List<Ticket> findAllTicket()throws Exception{
		SqlSession session = this.getSqlSession();
		List<Ticket> tickets = session.selectList("findAllTicket");
		return tickets;
	}
	
	@Override
	public void addTicket(Ticket ticket) throws Exception{
		SqlSession session = this.getSqlSession();
		Map<String,String> params = new HashMap<>();
		params.put("ticketNO", ticket.getTicketNO());
		params.put("flightNO", ticket.getFlightNO());
		params.put("seatNO", ticket.getSeatNO());
		session.insert("addTicket", params); 
	}
	
	@Override
	public void delTicketByNO(String ticketNO) throws Exception{
		SqlSession session = this.getSqlSession();
		Map<String,String> params = new HashMap<>();
		params.put("ticketNO", ticketNO);
		session.delete("delTicketByNO", params);
	}
	
	@Override
	public void updateTicketByNO(Ticket ticket) throws Exception{
		SqlSession session = this.getSqlSession();
		Map<String,String> params = new HashMap<>();
		params.put("ticketNO", ticket.getTicketNO());
		params.put("flightNO", ticket.getFlightNO());
		params.put("seatNO", ticket.getSeatNO());
		session.update("updateTicketByNO", params);
	}
}

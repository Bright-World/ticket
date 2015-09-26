package com.entity;
/*
 * 机票实体类
 */
public class Ticket {
	private String ticketNO; //票号
	private String flightNO; //所属航班号
	private String seatNO;  //座位号
	
	public String getTicketNO() {
		return ticketNO;
	}
	public void setTicketNO(String ticketNO) {
		this.ticketNO = ticketNO;
	}
	public String getFlightNO() {
		return flightNO;
	}
	public void setFlightNO(String flightNO) {
		this.flightNO = flightNO;
	}
	public String getSeatNO() {
		return seatNO;
	}
	public void setSeatNO(String seatNO) {
		this.seatNO = seatNO;
	}
}

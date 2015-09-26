package com.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.dao.MyBatisDAO;

public class TicketController implements Controller {

	@Autowired
	protected MyBatisDAO myBatisDAO;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(myBatisDAO);
		return null;
	}
	
	public void setMyBatisDAO(MyBatisDAO myBatisDAO) {
		this.myBatisDAO = myBatisDAO;
	}
}

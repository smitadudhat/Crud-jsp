package com.cjc.crudmvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.cjc.crudmvc.model.Student;
import com.cjc.crudmvc.servicei.Servicei;
import com.cjc.crudmvc.serviceimpl.ServiceImpl;
import com.cjc.crudmvc.utility.HibernateUtil;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	Servicei si=new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Register Servlet");
		Student s=new Student();
		String n=request.getParameter("name");
		String un=request.getParameter("username");
		String ps=request.getParameter("password");
		
		s.setName(n);
		s.setUsername(un);
		s.setPassword(ps);
		
	
		si.register(s);
	
		System.out.println("after Register Servlet");
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
}
}

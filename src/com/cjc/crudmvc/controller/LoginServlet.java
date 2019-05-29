package com.cjc.crudmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
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


@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	Servicei si=new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println("In login");
		Student s=new Student();
		
		String un=request.getParameter("username");
		String ps=request.getParameter("password");
		
		s.setUsername(un);
		s.setPassword(ps);
		
		
		List<Student> list=si.login(s);
		System.out.println(list);
			request.setAttribute("data",list);
			/*RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			*/
			if(list.isEmpty())
			{
				request.setAttribute("data","Invalid Data");
				RequestDispatcher rd1=request.getRequestDispatcher("login.jsp");
				rd1.forward(request, response);
				
			}else
			{
			request.setAttribute("data", list);
				RequestDispatcher rd2=request.getRequestDispatcher("success.jsp");
				rd2.forward(request, response);
			}
		
		}
		
	}



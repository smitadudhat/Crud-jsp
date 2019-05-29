package com.cjc.crudmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.crudmvc.model.Student;
import com.cjc.crudmvc.servicei.Servicei;
import com.cjc.crudmvc.serviceimpl.ServiceImpl;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
	Servicei si=new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		Student s=new Student();
		int id=Integer.parseInt(request.getParameter("rollno"));
		System.out.println(id);
		s.setRollno(id);
		
		List<Student> list=si.delete(s);
		request.setAttribute("data",list);
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		
	}

}

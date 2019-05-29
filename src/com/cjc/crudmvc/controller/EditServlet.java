package com.cjc.crudmvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.crudmvc.model.Student;
import com.cjc.crudmvc.servicei.Servicei;
import com.cjc.crudmvc.serviceimpl.ServiceImpl;
@WebServlet("/edit")
public class EditServlet extends HttpServlet{
	Servicei si=new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		Student s=new Student();
		int id=	Integer.parseInt(request.getParameter("rollno"));
		s.setRollno(id);
		Student st=si.edit(s);
		System.out.println(st.getPassword());
		request.setAttribute("data",st);
		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}
}

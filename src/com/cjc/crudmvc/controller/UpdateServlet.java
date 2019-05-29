package com.cjc.crudmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.cjc.crudmvc.model.Student;
import com.cjc.crudmvc.servicei.Servicei;
import com.cjc.crudmvc.serviceimpl.ServiceImpl;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
	Servicei si=new ServiceImpl();
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.service(arg0, arg1);
	Student s=new Student();
	
	String name=request.getParameter("name");
	String un=request.getParameter("username");
	String ps=request.getParameter("password");
	int id=Integer.parseInt(request.getParameter("rollno"));
	s.setRollno(id);
	System.out.println(id);
	s.setName(name);
	s.setUsername(un);
	s.setPassword(ps);
	
	System.out.println(s.getName());
	System.out.println(s.getUsername());
	System.out.println(s.getPassword());
	List<Student> list=si.update(s);
	request.setAttribute("data",list);
	RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	rd.forward(request, response);
	
}
}

package com.cjc.crudmvc.serviceimpl;

import java.util.List;

import com.cjc.crudmvc.daoi.DaoI;
import com.cjc.crudmvc.daoimpl.Daoimpl;
import com.cjc.crudmvc.model.Student;
import com.cjc.crudmvc.servicei.Servicei;

public class ServiceImpl implements Servicei {

	DaoI di=new Daoimpl();
	@Override
	public void register(Student s) 
	{
		di.register(s);
		
		
	}
	@Override
	public List<Student> login(Student s) {
		
		return di.login(s);
	
	}
	@Override
	public List<Student> delete(Student s) {
	
		return di.delete(s);
	}
	@Override
	public List<Student> update(Student s) {
		
		return di.update(s);
	}
	@Override
	public Student edit(Student s) {
		
		return di.edit(s);
	}

}

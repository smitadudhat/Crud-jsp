package com.cjc.crudmvc.daoi;

import java.util.List;

import com.cjc.crudmvc.model.Student;

public interface DaoI 
{
	public void register(Student s);
	
	public List<Student> login(Student s);

	public Student edit(Student s);

	public List<Student> update(Student s);

	public List<Student> delete(Student s);

}

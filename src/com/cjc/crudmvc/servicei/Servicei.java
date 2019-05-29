package com.cjc.crudmvc.servicei;

import java.util.List;

import com.cjc.crudmvc.model.Student;

public interface Servicei
{
public void register(Student s);

public List<Student> login(Student s);

public Student edit(Student s);

public List<Student> update(Student s);

public List<Student> delete(Student s);

}

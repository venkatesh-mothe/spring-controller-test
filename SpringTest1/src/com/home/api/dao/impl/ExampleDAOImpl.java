package com.home.api.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.home.api.dao.ExampleDAO;
import com.home.api.model.Employee;

@Repository
public class ExampleDAOImpl implements ExampleDAO {

	@Override
	public List<Employee> getEmployeeList() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("emp1");

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("emp2");

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);

		return list;

	}
}

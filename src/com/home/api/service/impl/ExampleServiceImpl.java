package com.home.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.api.dao.ExampleDAO;
import com.home.api.model.Employee;
import com.home.api.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private ExampleDAO exampleDAO;

	@Override
	public List<Employee> getEmployeeListDetails() {
		List<Employee> empList = exampleDAO.getEmployeeList();
		return empList;
	}
}

package com.home.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.home.api.model.Employee;
import com.home.api.service.ExampleService;

@Controller
public class ExampleController {

	@Autowired
	private ExampleService exampleService;

	@RequestMapping(value = "/getEmployeeList", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeList() {
		System.out.println("Hello");
		List<Employee> empList = exampleService.getEmployeeListDetails();
		return empList;
	}
}

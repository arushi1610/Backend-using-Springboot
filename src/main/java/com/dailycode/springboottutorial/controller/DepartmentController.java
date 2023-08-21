package com.dailycode.springboottutorial.controller;

import java.util.List;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycode.springboottutorial.entity.Department;
import com.dailycode.springboottutorial.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	private final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/departments")
	public Department saveDepartment( @Valid @RequestBody Department department) {
		LOGGER.info("inside savedepartment of controller");
		return departmentService.saveDepartment(department);
		//no need to create object , use DI spring will create it for you.
		//DepartmentService service =  new DepartmentServiceImp(); 
		
	}
	
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("inside fetchDepartmentById of controller");
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("Inside deleteDepartmentById of DepartmentController");
		 departmentService.deleteDepartmentById(departmentId);
		 return " Department deleted successfully!!";
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId , @RequestBody Department department)
	{
		LOGGER.info("Inside updateDepartment of DepartmentController");
		return departmentService.updateDepartment(departmentId , department);
	}
	
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		
		return departmentService.fetchDepartmentByName(departmentName);
	}

	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	
}
 
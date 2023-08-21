package com.dailycode.springboottutorial.service;

import java.util.List;

import com.dailycode.springboottutorial.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public  Department fetchDepartmentById(Long departmentId);
		// TODO Auto-generated method stub

	public  Department fetchDepartmentByName(String departmentName);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);
 


}

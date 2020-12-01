package com.tcs.departmentrestapi.service;

import java.util.List;
import java.util.Optional;

import com.tcs.departmentrestapi.model.Department;


public interface DepartmentService {

	public Department addDepartment(Department department);
	   public Department updateDepartment(Department department);
	   public String deleteDepartment(int id);
	   public Optional<Department>findById(int id);
	   public Optional<List<Department>> getDepartments();
	   public Optional<List<Department>> findByOrganizationId(int id);

	
	
}

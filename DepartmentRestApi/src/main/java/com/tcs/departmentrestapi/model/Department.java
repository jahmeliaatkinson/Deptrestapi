package com.tcs.departmentrestapi.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.domain.Page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name= "department_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Department {
	@Id
	@Column(name = "dept_Id")
	private int id;
	private int organizationId;
	@Column(name = "dept_name")
	private String name;
	//private List<Employee> employees;
	

	
	
	
}

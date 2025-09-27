package com.cloud.Deparment_Service.dto;

public class EmployeeDto {

	private int id;
	private int departmentId;
	private String name;
	private String position;
	
	public EmployeeDto(int id, int departmentId, String name, String position) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.name = name;
		this.position = position;
	}
	
	

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}

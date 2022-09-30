package com.employee.main.modelEntity;


import javax.persistence.Entity;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class ncr {
	
	@Id
	private int id;
	private String name;
	private String role;
	//private String location;
	public ncr() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		
		return "id :"+id+", name: "+name+", role: "+ role;
	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
	
}

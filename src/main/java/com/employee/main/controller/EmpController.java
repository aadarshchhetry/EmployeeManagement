package com.employee.main.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.main.modelEntity.ncr;
import com.employee.main.officeRepo.officeRepo;

//import com.employee.main.empDao.EmpDao;
//import com.employee.main.model.Employee;
//
//@RestController
//public class EmpController {
//	@Autowired
//	private Employee emp;
//
//	@Autowired
//	private EmpDao empData;
//
//	private void setEmp(String name, int id, String role) {
//		this.emp.setId(id);
//
//		this.emp.setName(name);
//		this.emp.setRole(role);
//	}
//
//	@RequestMapping("add")
//	public boolean add(@RequestParam("name") String name, @RequestParam("id") int id,
//			@RequestParam("role") String role) {
//		setEmp(name, id, role);
//		this.empData.setEmp(this.emp);
//
//		return this.empData.add();
//	}
//
//	@RequestMapping("view")
//	public ResponseEntity < List < Employee>> view(Model m) {
//		List<Employee> listOfEmp = empData.fetch();
//		listOfEmp.forEach(n-> System.out.println(n.getId()));
//		return new ResponseEntity < >(listOfEmp, HttpStatus.OK);
//	}
////devtool
//	@RequestMapping("search")
//	public List<Employee> search(@RequestParam("id") int id) {
//		setEmp(null, id, null);
//		this.empData.setEmp(this.emp);
//
//		return Arrays.asList(this.empData.Search());
//	}
//
//	@RequestMapping("delete")
//	public boolean delete(@RequestParam("id") int id) {
//		setEmp(null, id, null);
//		this.empData.setEmp(this.emp);
//
//		return this.empData.delete();
//	}
//
//}

@RestController
public class EmpController {
	
	@Autowired
	officeRepo ncrTable;
	
	@Autowired
	ncr ncrEntity;
	
	@PostMapping("add")
	public String add(@RequestParam("name") String name, @RequestParam("id") int id,
			@RequestParam("role") String role) {
		
		ncrEntity.setId(id);
		ncrEntity.setName(name);
		ncrEntity.setRole(role);
		
		ncrTable.save(ncrEntity);

		return "success";
	}

	@GetMapping("view")
	public List<ncr> view() {
		try {
			
		List<ncr> listOfEmp = ncrTable.selectAll();
		return listOfEmp;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@GetMapping("search")
	public List<ncr> search(@RequestParam("id") int id) {
		try {
			ncrEntity = ncrTable.selectOne(id);
			return Arrays.asList(ncrEntity);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

		
	}

	@DeleteMapping("delete")
	public String delete(@RequestParam("id") int id) {
		try {
		ncrTable.deleteById(id);
		return "success";
		}catch(Exception e) {
			return "failure";
		}
		
	}
	
}

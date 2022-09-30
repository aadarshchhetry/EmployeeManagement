	//package com.employee.main.empDao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import com.employee.main.EmployeeManagementApplication;
//import com.employee.main.model.Employee;
//import com.mysql.cj.xdevapi.Result;
//
//import ch.qos.logback.core.Context;
//
//import java.sql.*;
//
//@Component
//@Scope(value="prototype")
//public class EmpDao implements Dao<Employee>{
	
//	@Autowired
//	private Employee emp;
	//ApplicationContext app = EmployeeManagementApplication.context;
//	@Autowired
//	private ApplicationContext app;
	//Employee emp = app.getBean(Employee.class);
	
//	public Employee getEmp() {
//		return emp;
//	}
//
//	public void setEmp(Employee emp) {
//		this.emp = emp;
//	}

//	private Connection con;
//	private PreparedStatement pst;
//	
//	
//	@Override
//	public boolean add() {
//		
//		con = openConnection();
//		try {
//		pst = con.prepareStatement(DbAuth.INSERT);
//		
//		//pst.setString(1, emp.getLocation());
//		pst.setInt(1, emp.getId());
//		pst.setString(2, emp.getName());
//		pst.setString(3, emp.getRole());
//		pst.executeUpdate();
//		
//		return true;
//		}catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}finally {
//			closeConnection(con, pst);
//		}
//		
//	}
//
//	@Override
//	public List<Employee> fetch() {
//		List<Employee> listOfEmp = new ArrayList<>();
//		String name;
//		String role;
//		int id;
//		con = openConnection();
//		try {
//			pst = con.prepareStatement(DbAuth.SELECT_ALL);
//			
//			ResultSet rs = pst.executeQuery();
//			
//			while(rs.next()) {
//				
//				Employee emp = app.getBean(Employee.class);
//				name = rs.getString("name");
//				role = rs.getString("role");
//				id = Integer.parseInt(rs.getString("id"));
//				
//				emp.setId(id);
//				emp.setName(name);
//				emp.setRole(role);
//				
//				//System.out.println(emp.getId()); //emp -> []
//				
//				listOfEmp.add(emp);
//			}
//		
//		listOfEmp.forEach(System.out::println);
//		return listOfEmp;
//		}catch(Exception e) {
//			e.printStackTrace();
//			return null;
//		}finally {
//			closeConnection(con, pst);
//		}
//		
//	}
//
//	@Override
//	public boolean delete() {
//		
//		con = openConnection();
//		try {
//		pst = con.prepareStatement(DbAuth.DELETE);
//		
//		pst.setInt(1, emp.getId());
//		
//		int result = pst.executeUpdate();
//		if(result == 1)
//			return true;
//		}catch(Exception e) {
//			e.printStackTrace();
//			
//		}finally {
//			closeConnection(con, pst);
//			
//		}
//		return false;
//	}
//
//	@Override
//	public Employee Search() {
//		
//		con = openConnection();
//		try {
//		pst = con.prepareStatement(DbAuth.SELECT);
//		
//		pst.setInt(1, emp.getId());
//		
//		ResultSet rs = pst.executeQuery();
//		rs.next();
//		emp.setId(rs.getInt("id"));
//		emp.setName(rs.getString("name"));
//		emp.setRole(rs.getString("role"));
//		
//		return emp;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			closeConnection(con, pst);
//		}
//		return null;
//	}
//
//	
//	
//}

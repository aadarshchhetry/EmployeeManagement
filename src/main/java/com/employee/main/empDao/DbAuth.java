package com.employee.main.empDao;

import java.util.Arrays;
import java.util.List;

public class DbAuth {
	final static String DB_URL = "jdbc:mysql://localhost/office";
	final static String USER = "root";
	final static String PASS = "India@1234";
	
	final static String INSERT = "insert into ncr values(?,?,?)";
	final static String SELECT = "select * from ncr where id = ?";
	final static String SELECT_ALL = "select * from ncr";
	final static String DELETE = "DELETE FROM ncr WHERE id=?";
	
	final static List<String> LOCATION = Arrays.asList("ncr", "pune","bangalore","mumbai");
	
}

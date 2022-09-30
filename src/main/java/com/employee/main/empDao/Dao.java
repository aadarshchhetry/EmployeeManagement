package com.employee.main.empDao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;



public interface Dao<E> {
	
	public List<E> fetch();
	public boolean delete();
	public E Search();
	boolean add();
	
	default Connection openConnection() {
		
		try {
			return DriverManager.getConnection(DbAuth.DB_URL,DbAuth.USER,DbAuth.PASS);

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	default boolean closeConnection(Connection con, PreparedStatement pst) {
		
		try {
			con.close();
			pst.close();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
}

package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.beans.Employee;

public class DAOJDBCImpl implements DAO{

	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	@Override
	public boolean createEmployee(Employee emp) {
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/caps?user=root&password=root";
			con = DriverManager.getConnection(url);
			
			String query = "insert into caps_buggers values(?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,emp.getId());
			pstmt.setString(2,emp.getName());
			pstmt.setDouble(3,emp.getSalary());
			int count = pstmt.executeUpdate();
			if(count>0)
			{
				return true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		finally
		{
			
		}
		return false;
	}

	@Override
	public Employee readEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.demo.service;

import com.demo.beans.Employee;
import com.demo.dao.DAOJDBCImpl;

public class ServiceDAOImpl implements ServiceDAO{

	DAOJDBCImpl impl = new DAOJDBCImpl();
	@Override
	public boolean createEmployee(Employee emp) {
		boolean b = impl.createEmployee(emp);
		return b;
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

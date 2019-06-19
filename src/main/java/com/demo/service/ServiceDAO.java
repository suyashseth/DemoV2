package com.demo.service;

import com.demo.beans.Employee;

public interface ServiceDAO {
	public boolean createEmployee(Employee emp);

	public Employee readEmployee(int id);

	public boolean updateEmployee(Employee emp);

	public boolean deleteEmployee(int id);
}

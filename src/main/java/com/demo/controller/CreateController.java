package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Employee;
import com.demo.service.ServiceDAO;
import com.demo.service.ServiceDAOImpl;

@WebServlet("/create")
public class CreateController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		double sal = Double.parseDouble(req.getParameter("sal"));
		
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(sal);
		
		ServiceDAO dao = new ServiceDAOImpl();
		boolean result = dao.createEmployee(emp);
		if(result)
		{
			resp.sendRedirect("./success.jsp");
		}
		else
		{
			resp.sendRedirect("./failed.jsp");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

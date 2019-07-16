package com.pack.Spring.service;

import java.util.ArrayList;
import java.util.List;
import com.pack.Spring.model.*;
import com.pack.Spring.Dao.*;


public interface Employeeservice {
	
	public Employee saveEmployee(Employee employee);

    public List<Employee> fetchAllEmployees();

    public Employee findById(int id);

    public void deleteEmployee(int id);

}

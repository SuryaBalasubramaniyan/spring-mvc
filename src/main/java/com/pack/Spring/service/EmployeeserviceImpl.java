package com.pack.Spring.service;
import com.pack.Spring.model.*;

import com.pack.Spring.Dao.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service(value = "employeeservice")
public class EmployeeserviceImpl implements Employeeservice {

   // @Autowired( required = true)
   // @Qualifier(value = "mysqlDAOImpl")
    private EmployeeDao employeeDAO;

    public EmployeeserviceImpl(@Qualifier(value = "mysqlDAOImpl")EmployeeDao employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    public Employee saveEmployee(Employee employee) {
        System.out.println("Inside the save employee method of Employee service class ....");
        return employeeDAO.save(employee);
    }

    public List<Employee> fetchAllEmployees() {
        return employeeDAO.listAll();
    }

    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    public void deleteEmployee(int id) {
    	//System.out.println("within delete");
    	//employeeDAO.deleteEmployee(id);
    }
}

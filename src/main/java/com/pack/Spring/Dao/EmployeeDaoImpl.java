package com.pack.Spring.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pack.Spring.model.*;
//@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static List<Employee> employees = new ArrayList<Employee>();

    public Employee save(Employee employee) {
        employees.add(employee);
        //System.out.println("inside the save method of EMployeeDAO");
        //System.out.println("Saved "+employee.getName());
        return employee;
    }

    public List<Employee> listAll() {
        System.out.println("Inside the list all method of EmployeeDAO");
        return null;
    }

    public Employee findById(int id) {
        System.out.println("Inside the findBYId method of EmployeeDAO");
        return null;
    }
 
    public void deleteEmployee(int id) {
        System.out.println("inside the delete method of EmployeeDAO");
    }
}

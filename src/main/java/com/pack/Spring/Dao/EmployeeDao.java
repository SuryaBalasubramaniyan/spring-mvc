package com.pack.Spring.Dao;


import com.pack.Spring.model.*;

import java.util.List;

public interface EmployeeDao {

    public Employee save(Employee employee);

    public List<Employee> listAll();

    public Employee findById(int id);

    public void deleteEmployee(int id);

}
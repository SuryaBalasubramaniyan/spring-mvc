package com.pack.Spring.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pack.Spring.model.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "mysqlDAOImpl")
public class MySqlEmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	 public MySqlEmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}

	public Employee save(Employee employee) {
	        System.out.println("Came inside the save method of MySQLEmployeeDAOImpl");
	        jdbcTemplate.execute("insert into employee(name) values('"+employee.getName()+"')");
	         return employee;
	    }

	    public List<Employee> listAll() {
	    	
	        List<Employee> emplist=jdbcTemplate.query("select * from employee",(rs,rowNum)->new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));;
	        	
	        	
					
	        return emplist;
	    	 
		        
	    }

	    public Employee findById(int id) {
	       return jdbcTemplate.queryForObject("select * from employee where id='"+id+"'",(rs,rowNum)->
	    {
	    	Employee emp=new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
	    return emp;
	    });
       	
	      
	        
	    }

	    public void deleteEmployee(int id) {
	    	//System.out.println("within mysql delete method");
	    	jdbcTemplate.execute("delete from employee where id='"+id+"' ");
	    }

}

package com.pack.Spring.controller;
import com.pack.Spring.model.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class RegisterController {

    @GetMapping("/login")
    public String login(){
        return "login";
        
    }
    
    @GetMapping("/listAll")
    public String fetchAllEmployees(Model model) {
    	List<Employee> emplist=new ArrayList<>();
    	//emplist.forEach(System.out::println);
    	emplist.add(new Employee(1,"sound",21,25000));
    	model.addAttribute("emplist",emplist);
    	return "display";
    }
}
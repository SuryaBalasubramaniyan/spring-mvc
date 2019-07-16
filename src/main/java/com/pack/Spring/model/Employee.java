package com.pack.Spring.model;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class Employee {
	private final int id;
	private final String name;
	private int age;
	private double salary;
}

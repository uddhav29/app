package com.example.beans.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.beans.Employee;

public class EmployeeService {
	
	
	private Map  getListOfEmployee(){
	    Map  employees = new HashMap<>();
		
	    Employee emp1 = new Employee(1,"Uddhav Pawar" , "Analyst" , "9423424428" , "Pune");
		Employee emp2 = new Employee(2,"Arpita Roy" , "Analyst" , "9049686741" , "Magarpatta");
		Employee emp3 = new Employee(3,"Monali Parihar" , "Analyst" , "9403162142" , "Shivaji nagar");
		Employee emp4 = new Employee(4,"Dhananjay Belgaonkar" , "Analyst" , "9423424428" , "hadapsar");
		Employee emp5 = new Employee(5,"varun mehta" , "Analyst" , "987654120" , "Pune");
		
		employees.put(emp1.getTaxId(),emp1);
		employees.put(emp2.getTaxId(),emp2);
		employees.put(emp3.getTaxId(),emp3);
		employees.put(emp4.getTaxId(),emp4);
		employees.put(emp5.getTaxId(),emp5);
		
		return employees;

		}
	
	public Employee getEmployee(int id) {
		return (Employee)getListOfEmployee().get(id);
	}

}

package com.example.beans.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.beans.Employee;




public class EmployeeService {
	Map  employees = new HashMap<>();
	
	private Map getListOfEmployee(){
		
		JSONParser jsonParser = new JSONParser();
		 try (FileReader reader = new FileReader("input.json"))
	        {
	            //Read JSON file
	            Object obj = jsonParser.parse(reader);
	 
	            JSONArray employeeList = (JSONArray) obj;
	         
	             
	            //Iterate over employee array
	           employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		System.out.println(employees);
		return employees;

		}
	  private void parseEmployeeObject(JSONObject employee)
	    {
	        //Get employee object within list
	        JSONObject employeeObject = (JSONObject) employee.get("employee");
	        Employee emp = new Employee((long)employeeObject.get("taxId"),(String) employeeObject.get("name"), (String) employeeObject.get("role") , (String) employeeObject.get("contactNumber") , (String) employeeObject.get("address") , (String)employeeObject.get("earning"));
	        System.out.println((String)employeeObject.get("earning"));
	        System.out.println(emp);
	        employees.put(emp.getTaxId(),emp);
	   }
	public Employee getEmployee(long id) {
		return (Employee)getListOfEmployee().get(id);
	}

}

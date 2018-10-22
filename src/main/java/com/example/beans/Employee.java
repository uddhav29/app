package com.example.beans;

public class Employee {

	private long taxId;
	private String name;
	private String role;
	private String contactNumber;
	private String address;
	private String amount;
	
	
public Employee(long taxId, String name, String role, String contactNumber, String address, String amount) {
		super();
		this.taxId = taxId;
		this.name = name;
		this.role = role;
		this.contactNumber = contactNumber;
		this.address = address;
		this.amount = amount;
	}

	public long getTaxId() {
		return taxId;
	}
	public void setTaxId(long taxId) {
		this.taxId = taxId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Employee [taxId=" + taxId + ", name=" + name + ", role=" + role + ", contactNumber=" + contactNumber
				+ ", address=" + address + ", amount=" + amount + "]";
	}
	
	
	
	
}

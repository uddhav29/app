package com.example.beans;

public class Employee {

	private int taxId;
	private String name;
	private String role;
	private String contactNumber;
	private String address;
	
	public Employee(int taxId, String name, String role, String contactNumber, String address) {
		super();
		this.taxId = taxId;
		this.name = name;
		this.role = role;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
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
	@Override
	public String toString() {
		return "Marketer [taxId=" + taxId + ", name=" + name + ", role=" + role + ", contactNumber=" + contactNumber
				+ ", address=" + address + "]";
	}
	
	
	
}

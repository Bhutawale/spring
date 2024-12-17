package com.spring_core_AutoWired_Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{	
	@Autowired  //IMP Note: @Autowired annotation can be used at variable level/setter method level or at constructor level. 
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}

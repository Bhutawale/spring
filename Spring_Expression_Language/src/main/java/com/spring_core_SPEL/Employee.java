package com.spring_core_SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee
{
	@Value("01")
	private int eid;
	
	@Value("Satish Bhutawale")
	private String ename;
	
	@Value("Karjat")
	private String ecity;
	
	@Value("#{11+22}")  //Spring Expression Language- Supports parsing and executing expression with the help of @Value annotation.
	private int add;
	
	@Value("#{5>2}")    //if condition is true it will return true else false.
	private boolean istrue;
	
	@Value("#{10>5?55:0}") //if condition is true it will return 55 else it will return 0.
	private int num;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")   // using static method in the SPEL.
	private double root;
	
	@Value("#{T(java.lang.Math).PI}")    //using static variable in the SPEL.
	private double PI;
	
	@Value("#{new java.lang.String('Sanskruti Bhutawale')}")   //creating object of String class and assigning value.
	private String name;
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + ", add=" + add + ", istrue=" + istrue
				+ ", num=" + num + ", root=" + root + ", PI=" + PI + ", name=" + name + "]";
	}
	
	
}

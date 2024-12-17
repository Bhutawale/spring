package com.spring_core_constructor;

public class Person 
{
	private int pid;
	private String pname;
	
	private Certificate certi;
	
	public Person(int pid, String pname, Certificate certi)
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.certi= certi;
	}

	@Override
	public String toString()
	{
		return "Person [pid=" + pid + ", pname=" + pname + ",Certificate="+ certi +"]";
	}
	
	
}

package com.spring_core_constructor_ambiguity;

public class Addition 
{
	private int a;
	private int b;
	
	Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Int,Int Constructor");
	}
	
	Addition(double a,double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Double,Double Constructor");
	}
	
	Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String,String Constructor");
	}
	public void add()
	{
		System.out.println("Addition of a ("+ this.a +") and b (" +this.b +") is "+ (a+b));
	}
}

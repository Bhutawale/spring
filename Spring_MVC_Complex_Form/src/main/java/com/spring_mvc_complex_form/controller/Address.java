package com.spring_mvc_complex_form.controller;

public class Address 
{
	private String city;
	private String dist;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", dist=" + dist + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String dist) {
		super();
		this.city = city;
		this.dist = dist;
	}
	
}

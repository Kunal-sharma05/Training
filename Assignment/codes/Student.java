package com.hexaware.beanindetail;

public class Student {
	private Address address;

	public Student(Address address) {
		super();
		this.address = address;
	}
	public void init()
	{
		System.out.println("Initialization logic");
		
	}
	public void print()
	{
		this.address.print();
		System.out.println("print from student");
	}

	public void destroy()
	{
		System.out.println("Destroy logic");
		
	}
}

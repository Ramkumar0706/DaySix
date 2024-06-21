package com.javaConcepts;
import java.lang.String;
public class Employee extends Person implements Cloneable {
	int age;
	static int salary;
	
	{
		this.age=28;
		Employee.salary=1500;
	}
	
	public Employee(){
		this(20);
	}
	
	public Employee(int age) {
		this.age=age;
	}
	
	public void  work() {
		System.out.println("Tne employee is Working");
		this.work("Ram");
	}
	
	public Employee getinstances(){
		return this;
	}
	
	public void work(String name) {
		System.out.println(name+" is working this is called method overloading");
	}
	
	public static void main(String name) {
		System.out.println("hi "+name+" main method is overloaded");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public void work(int hour) {
		super.work(hour);
		System.out.println("Person class method overridden");
	}
	
	@Override
	public Employee coVarientReturnType() {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public String toString() {
		return "Employee Class";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p=new Employee();
		p.work(24);
		System.out.println("========================");
		System.out.println(p.GENDER);
		System.out.println("========================");
		System.out.println(p.coVarientReturnType());
		System.out.println("========================");
		
		Employee e=(Employee)p;
		System.out.println(e.age);
		System.out.println("========================");
		System.out.println(e.coVarientReturnType());
		System.out.println("========================");
		System.out.println(e.GENDER);
		System.out.println("========================");
		e.work();
		System.out.println("========================");
		e.work(25);
		
		System.out.println(e.getinstances()+"return current class object");
		System.out.println("========================");
		System.out.println(Employee.salary);
		
		Employee e1=new Employee();
		//cloning
		System.out.println("========================");
		
		Employee e2=(Employee)e1.clone();
		e2.age=222;
		System.out.println(e2.age);
		
	}

}

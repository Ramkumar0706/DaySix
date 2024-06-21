package com.javaConcepts;

public abstract class Person {
	
	public final static String  GENDER="MALE";
	
	public void work(int hour) {
		System.out.println("the orginal work method in Person Class");
	}
	
	public Person coVarientReturnType() {
		return this;
	}
	
	@Override
	public String toString() {
		return "Person class";
	}
	

}

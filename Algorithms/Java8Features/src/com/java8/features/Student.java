package com.java8.features;
import java.util.LinkedList;
import java.util.List;

public class Student
{
	static List<Student> studentsList=new LinkedList<>(); 
	
	int rollNo;
	String Name;
	
	public static void addStudent(int rollNo, String Name)
	{
		Student temp =new Student();
		temp.Name=Name;
		temp.rollNo=rollNo;
		studentsList.add(temp);
		
	}
	
	public String toString()
	{
		
		return "Name : "+this.Name+ " RollNo : "+this.rollNo;
	}
	
}

package com.java8.features;

import java.util.stream.Collectors;


public class StreamExample {
	
	public static void main(String[] args) {
	Student.addStudent(1, "A");
	Student.addStudent(2, "B");
	Student.addStudent(3, "C");
	Student.addStudent(4, "D");
	Student.addStudent(5, "E");
	
	System.out.println(Student.studentsList.stream().count());
	
	Student.studentsList.stream().filter((s)->s.rollNo>3).
	collect(Collectors.toList()).forEach(System.out::println);
	}
}

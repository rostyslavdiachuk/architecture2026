package ua.edu.chnu.gof.facade;

import ua.edu.chnu.domain.Student;

import java.util.Map;


public class NewDbService {
	private static Map<String, Student> students = Map.of("Shevchenko", new Student("Shevchenko", 123));

	public static Student getStudentByString(String s) {
		System.out.println("New service got request " + s);
		var student = students.get(s);
		System.out.println("Student returned : " + student);
		return student;
	}
}

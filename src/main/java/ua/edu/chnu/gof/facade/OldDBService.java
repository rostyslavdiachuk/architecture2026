package ua.edu.chnu.gof.facade;

import ua.edu.chnu.domain.Student;

import java.util.Map;


public class OldDBService {
	private static Map<String, Student> students = Map.of("Diachuk", new Student("Diachuk", 123));

	public static Student getStudentByString(String s) {
		System.out.println("Old service got request " + s);
		var student = students.get(s);
		System.out.println("Student returned : " + student);
		return students.get(s);
	}
}

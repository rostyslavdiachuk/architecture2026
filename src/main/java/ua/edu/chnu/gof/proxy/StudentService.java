package ua.edu.chnu.gof.proxy;

public interface StudentService {
	Student getStudent(String name);

	Student saveStudent(Student student);
}

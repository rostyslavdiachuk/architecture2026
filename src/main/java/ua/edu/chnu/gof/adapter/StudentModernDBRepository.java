package ua.edu.chnu.gof.adapter;

import java.util.List;

public interface StudentModernDBRepository {

	Student getById(String id);

	List<Student> getAll();

	Student save(Student student);

	void deleteById(String id);

	void delete(Student student);
}

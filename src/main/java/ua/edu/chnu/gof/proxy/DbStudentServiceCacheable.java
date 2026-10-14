package ua.edu.chnu.gof.proxy;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
public class DbStudentServiceCacheable implements StudentService {
  private final StudentService service;
//  private List<Student> cache = new ArrayList<>();
  private Map<String, Student> cache= new HashMap<>();

  @Override
  public Student getStudent(String name) {

    System.out.println("Looking for " + name + " in cache");
    var studentOptional = Optional.ofNullable(cache.get(name));
    if (studentOptional.isPresent()) {
      System.out.println("Found in cache" + name);
      return studentOptional.get();
    }

    var student = service.getStudent(name);
    if (student != null) {
      cache.put(name, student);
    }
    return student;
  }

  @Override
  public Student saveStudent(Student student) {
    cache.put(student.getName(), student);
    service.saveStudent(student);
    return student;
  }
}

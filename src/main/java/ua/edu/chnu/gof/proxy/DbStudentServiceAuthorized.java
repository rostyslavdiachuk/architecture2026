package ua.edu.chnu.gof.proxy;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

@RequiredArgsConstructor
public class DbStudentServiceAuthorized implements StudentService {
  private final StudentService service;

  @Override
  public Student getStudent(String name) {
      return service.getStudent(name);

  }

  @Override
  public Student saveStudent(Student student) {
    var random = new Random();
    if (random.nextInt() % 2 == 1){
    return service.saveStudent(student);

    }
    throw new RuntimeException("No Permissions");
  }

}

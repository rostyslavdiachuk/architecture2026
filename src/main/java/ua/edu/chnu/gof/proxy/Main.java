package ua.edu.chnu.gof.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static DbStudentService service = new DbStudentService();
  private static DbStudentServiceCacheable newService = new DbStudentServiceCacheable(service);
  private static DbStudentServiceAuthorized newNewService = new DbStudentServiceAuthorized(newService);

  public static void main(String[] args) {
    var names = Arrays.asList("Diachuk", "Shevchenko", "Flint", "Petrov");
    getStudentsByNames(names);
    getStudentsByNames(names);

    System.out.println("_________________________");
    getStudentsByNamesCached(names);
    getStudentsByNamesCached(names);

    createNewStudent();
    createNewStudent();
    createNewStudent();
    createNewStudent();
    createNewStudent();
    createNewStudent();
    createNewStudent();
    createNewStudent();
    createNewStudent();


  }

  private static List<Student> getStudentsByNames(List<String> names) {
    return names.stream()
        .map(el -> service.getStudent(el))
        .collect(Collectors.toList());
  }

  private static List<Student> getStudentsByNamesCached(List<String> names) {
    return names.stream()
        .map(el -> newNewService.getStudent(el))
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    //.collect(Collectors.toList());
  }

  private static void createNewStudent(){
    try {
      newNewService.saveStudent(Student.builder().build());
    } catch (RuntimeException ex){
      System.out.println(ex.getMessage());
    }
    }
}

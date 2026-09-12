package ua.edu.chnu.gof.singleton;

import java.util.Arrays;

public enum DbConnectionSingle {
  INSTANCE("1.0.0"),
  INSTANCE1("1.0.0"),
  INSTANCE3("1.0.0");

  private final String version;

  DbConnectionSingle(String version) {
    System.out.println("INITIALIZING CONNECTION");
    this.version = version;
  }


  public void insertStudents(String ...students){
    System.out.println("inserting students");
    Arrays.stream(students)
        .forEach(System.out::println);
    System.out.println("students inserted");
  }


}

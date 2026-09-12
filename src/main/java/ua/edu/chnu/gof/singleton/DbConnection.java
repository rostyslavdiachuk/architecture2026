package ua.edu.chnu.gof.singleton;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnection {
  private static DbConnection instance;
  private static ReentrantLock lock = new ReentrantLock();
  private DbConnection() {
    System.out.println("INITIALIZING CONNECTION");
  }

  public static DbConnection getInstance() {
    var result = instance;
    if (result != null) {
      return result;
    }
    lock.lock();
    if (instance == null) {
      instance = new DbConnection();
    }
    lock.unlock();
    return instance;
  }


  public void insertStudents(String ...students){
    System.out.println("inserting students");
    Arrays.stream(students)
        .forEach(System.out::println);
    System.out.println("students inserted");
  }

}

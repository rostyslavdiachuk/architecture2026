package ua.edu.chnu.gof.singleton;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
  static void main() {
    IntStream.range(0,1000)
        .mapToObj(_-> new Thread(DbConnection::getInstance))
        .forEach(Thread::start);
    var instance = DbConnectionSingle.INSTANCE;
    instance.insertStudents("Rostyk");

//    var studentService = new StudentService(dbConnection);

//    studentService.saveStudents("Rostyk", "Dmytro", "Ivan");
  }
}

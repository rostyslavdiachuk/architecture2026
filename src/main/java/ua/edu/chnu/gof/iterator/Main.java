package ua.edu.chnu.gof.iterator;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    var students = new StudentList(
        new StudentListNode(
            new Student("1", "Diachuk", 643),
            new StudentListNode(
                new Student("2", "Diachuk2", 543),
                new StudentListNode(new Student("3", "Diachuk3", 443), null))));

    var iterator = students.iterator();
    System.out.println(iterator);
    System.out.println(iterator.next());
    System.out.println(iterator.next());
    System.out.println(iterator.next());

//    for (var student: students){
//      System.out.println(student.getCurrent());
//    }


//    var integers = new Infinity2Pow();
//    for (var num: integers){
//      if(num > 10000000){
//        break;
//      }
//      System.out.println(num);
//    }
//

//    students.forEach(i -> {
//      System.out.println(i.getCurrent());
//    });
  }
}

package ua.edu.chnu.gof.prototype;

public class Main {

  static void main() {
    var math = new Subject(1, "Math",
        30, 1,
        4, 443, 10);

//    var appz = new Subject(2, "appz",
//        math.getCredits(), math.getSemester(),
//        math.getYear(), math.getGroup(), 11);
    var appz = (Subject)math.copy();
    appz.setId(2);
    appz.setName("APPZ");
    appz.setTeacherId(11);
    try {
     var a = (Subject) appz.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }


    System.out.println("math = " + math);
    System.out.println("appz = " + appz);
  }

}

package ua.edu.chnu.gof.flyweight;

public class Main {
  public static void main(String[] args) {
    GroupCache.addGroup(new Group(2015, "Ivanov"));
    var diachuk = new Student("Diachuk", 2015, "Ivanov");
    var diachuk1 = new Student("Diachuk", 2015, "Ivanov");
    var diachuk2 = new Student("Diachuk", 2015, "Ivanov");
    var diachu3 = new Student("Diachuk", 2015, "Ivanov");
    var diachuk4 = new Student("Diachuk", 2015, "Ivanov");
    var diachuk5 = new Student("Diachuk", 2015, "Ivanov");
    System.out.println(diachuk1.getGroup() == diachuk5.getGroup());
    System.out.println(diachuk.getName() + " " + diachuk.getStart_year() + " " + diachuk.getCurator());
  }
}

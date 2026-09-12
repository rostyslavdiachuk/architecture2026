package ua.edu.chnu.gof.prototype;

public class Subject implements Prototype, Cloneable{
  private int id;
  private String name;
  private int credits;
  private int semester;
  private int year;
  private int group;
  private int teacherId;

  public Subject(Subject subject) {
     this(subject.id, subject.name, subject.credits,
         subject.semester, subject.year,
         subject.group, subject.teacherId);
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }

  public Subject(int id, String name, int credits, int semester, int year, int group,
      int teacherId) {
    this.id = id;
    this.name = name;
    this.credits = credits;
    this.semester = semester;
    this.year = year;
    this.group = group;
    this.teacherId = teacherId;
  }

  @Override
  public String toString() {
    return "Subject{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", credits=" + credits +
        ", semester=" + semester +
        ", year=" + year +
        ", group=" + group +
        ", teacherId=" + teacherId +
        '}';
  }


  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Subject(this);
  }

  @Override
  public Prototype copy() {
    return new Subject(this);
  }
}

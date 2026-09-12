package ua.edu.chnu.gof.singleton;

public class StudentService {
  private DbConnection dbConnection;

  public StudentService(DbConnection dbConnection) {
    this.dbConnection = dbConnection;
  }

  public void saveStudents(String ...students){
    dbConnection.insertStudents(students);
  }
}

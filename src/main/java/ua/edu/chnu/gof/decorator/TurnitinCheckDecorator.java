package ua.edu.chnu.gof.decorator;

public class TurnitinCheckDecorator extends PlagiarismCheckerDecorator{
  public TurnitinCheckDecorator(PlagiarismChecking checker) {
    super(checker);
  }

  @Override
  public void checkForPlagiarism(String file) {
    this.checker.checkForPlagiarism(file);
    this.result = 10;
    System.out.println("Turnitin checked for plagiarism");
  }
}

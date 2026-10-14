package ua.edu.chnu.gof.decorator;

public class Main {
  public static void main(String[] args) {
    var checker = new TurnitinCheckDecorator(new GithubCheckDecorator(new ChnuPlagiarismChecker()));
    checker.checkForPlagiarism("file");
    System.out.println(checker.result);
  }

}

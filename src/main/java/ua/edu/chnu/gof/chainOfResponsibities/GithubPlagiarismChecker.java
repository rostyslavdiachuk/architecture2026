package ua.edu.chnu.gof.chainOfResponsibities;

import lombok.AllArgsConstructor;

public class GithubPlagiarismChecker extends BasePlagiarismChecker {
  public GithubPlagiarismChecker(BasePlagiarismChecker next) {
    super(next);
  }

  @Override
  public boolean shouldHandle(Document file) {
    return file.getCode() != null;
  }

  @Override
  public void handle(Document file) {
    System.out.println("Github is checking code for plagiarism");
  }
}

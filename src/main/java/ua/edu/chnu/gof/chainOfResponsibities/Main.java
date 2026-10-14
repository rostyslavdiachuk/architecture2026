package ua.edu.chnu.gof.chainOfResponsibities;

public class Main {
	public static void main(String[] args) {
		var checkerChain =
				new UniCheckPragiarismChecker(
						new GithubPlagiarismChecker(
								new ChnuPlagiarismChecker(null)));
		checkerChain.checkForPlagiarism(Document.builder().text("Text").code("Code").build());
	}
}

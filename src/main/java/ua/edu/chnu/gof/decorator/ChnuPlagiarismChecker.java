package ua.edu.chnu.gof.decorator;

public class ChnuPlagiarismChecker  implements PlagiarismChecking{
	@Override
	public void checkForPlagiarism(String file) {
		System.out.println("CHNU is checking for plagiarism");
	}
}

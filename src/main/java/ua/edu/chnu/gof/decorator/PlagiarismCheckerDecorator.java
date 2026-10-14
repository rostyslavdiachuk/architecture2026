package ua.edu.chnu.gof.decorator;

public abstract class PlagiarismCheckerDecorator implements PlagiarismChecking {

	public PlagiarismCheckerDecorator(PlagiarismChecking checker) {
		this.checker = checker;
	}

	protected PlagiarismChecking checker;
	protected int result;
//	public abstract void checkForPlagiarism(String file);
}

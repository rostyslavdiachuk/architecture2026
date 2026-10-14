package ua.edu.chnu.gof.chainOfResponsibities;

public interface PlagiarismChecking {
	void checkForPlagiarism(Document file);
	boolean shouldHandle(Document file);
	void handle(Document file);
}

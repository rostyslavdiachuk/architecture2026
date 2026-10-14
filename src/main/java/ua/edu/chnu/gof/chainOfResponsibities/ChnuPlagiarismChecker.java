package ua.edu.chnu.gof.chainOfResponsibities;

import lombok.AllArgsConstructor;
import lombok.Data;


public class ChnuPlagiarismChecker extends BasePlagiarismChecker {

	public ChnuPlagiarismChecker(BasePlagiarismChecker next) {
		super(next);
	}

	@Override
	public boolean shouldHandle(Document file) {
		return true;
	}

	@Override
	public void handle(Document file) {
		System.out.println("Chnu is checking code for plagiarism");
	}
}

package ua.edu.chnu.gof.chainOfResponsibities;

import lombok.AllArgsConstructor;


public class UniCheckPragiarismChecker extends BasePlagiarismChecker {
	public UniCheckPragiarismChecker(BasePlagiarismChecker next) {
		super(next);
	}

	@Override
	public boolean shouldHandle(Document file) {
		return file.getText() != null;
	}

	@Override
	public void handle(Document file) {
		System.out.println("UniCheck is checking code for plagiarism");
	}
}

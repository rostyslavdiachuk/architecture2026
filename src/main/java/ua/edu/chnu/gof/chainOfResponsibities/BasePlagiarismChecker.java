package ua.edu.chnu.gof.chainOfResponsibities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BasePlagiarismChecker implements PlagiarismChecking {
	private BasePlagiarismChecker next;

	public BasePlagiarismChecker(BasePlagiarismChecker next) {
		this.next = next;
	}

	public abstract boolean shouldHandle(Document file);
	public abstract void handle(Document file);

	public void checkForPlagiarism(Document file){
		if(shouldHandle(file)){
			handle(file);
		}

		if (this.getNext() != null) {
			this.getNext().checkForPlagiarism(file);
		}
	}
}

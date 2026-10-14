package ua.edu.chnu.gof.facade;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.edu.chnu.domain.Student;

public class SuperPuperOldCoolMarkService {

	public Mark getMarkByName(Student stud) {
		return new Mark(stud.getName().length() * 10);
	}

	@Data
	@AllArgsConstructor
	public static class Mark {
		private int mark;

		public void fixMark() {
			if (this.mark > 100) {
				this.mark = Double.valueOf(100 - (this.mark - 100) * Math.random()).byteValue();
			}
		}
	}


}

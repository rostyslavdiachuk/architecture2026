package ua.edu.chnu.gof.abstractFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.edu.chnu.gof.factoryMethod.UniversityClass;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LectureClass extends UniversityClass {
	private List<Integer> attendeeGroups;


	public LectureClass(String subject, List<Integer> attendeeGroups) {
		super(subject);
		this.attendeeGroups = attendeeGroups;
	}

	@Override
	public void notifyAttendee() {
		attendeeGroups.forEach(this::notify);
		System.out.println("________________________________________");
	}

	private void notify(Integer group) {
		System.out.println(group + " group will have LECTURE " + this.getSubject());
	}
}




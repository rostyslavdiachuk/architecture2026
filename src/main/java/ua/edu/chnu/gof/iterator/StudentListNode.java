package ua.edu.chnu.gof.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentListNode implements Iterator<StudentListNode> {
	private Student current;
	private StudentListNode next;


	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public StudentListNode next() {
		if (this.hasNext()) {
			current = next.current;
			return next;
		}
		throw new NoSuchElementException("dont have next");
	}

}

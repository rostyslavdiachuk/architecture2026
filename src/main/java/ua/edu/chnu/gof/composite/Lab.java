package ua.edu.chnu.gof.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Lab implements Evaluable {
	private int number;
	private int mark;



	@Override
	public int getSumOfMarksForBranches() {
		return mark;
	}

	@Override
	public List<Evaluable> getChildren() {
		return null;
	}
}

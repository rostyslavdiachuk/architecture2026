package ua.edu.chnu.gof.abstractFactory;

import lombok.Data;

@Data
public abstract class Log {
	private String subject;
	private Integer group;

	protected abstract void prepareLog();
}

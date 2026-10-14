package ua.edu.chnu.gof.command;

import java.util.ArrayList;
import java.util.List;

public class EditorControllerV2 {
	private static final GitService git = new GitService();
	private static List<Command> commands = new ArrayList<>();

	public String processAction(String action, String project) {
		switch (Actions.valueOf(action)) {
			case INIT:
				init();
				break;
			case COMMIT:
				commit(project);
				break;
			case REVERT:
				revert();
				break;
			case PUSH:
				push();
				break;
			default:
				throw new UnsupportedOperationException();
		}
		return project;
	}

	public void push() {
		commands.add(()-> git.push(null));
	}

	public void revert() {
		commands.add(() -> git.revert(null));
	}

	public void commit(String project) {
		commands.add(()-> git.commit(project));
	}

	public void init() {
		commands.add(()-> git.init(null));
	}

	public void publishToGithub() {
		commands.forEach(Command::execute);
		System.out.println("Code is on github now");
	}

	public void getHistory() {
		commands.forEach(System.out::println);
	}

	enum Actions {
		COMMIT, REVERT, PUSH, INIT
	}
}

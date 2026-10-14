package ua.edu.chnu.gof.command;

public class Main {

	public static void main(String[] args) {
		var editorController = new EditorControllerV2();
		editorController.init();
		editorController.commit( "a");
		editorController.commit("as");
		editorController.revert();
		editorController.push();

		editorController.getHistory();

		editorController.publishToGithub();
	}
}

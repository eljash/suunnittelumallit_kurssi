package main.java.teht_22_command;

/**
 * Invoker
 * @author Eljas
 *
 */
public class WallButton {
	Command cmd;
	public WallButton(Command cmd) {
		this.cmd = cmd;
	}
	public void push() {
		cmd.execute();
	}
}

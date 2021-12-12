package main.java.teht_22_command;

/**
 * Komento jolla valkokangas nostetaan
 * @author Eljas
 *
 */
public class RollUpCommand implements Command {
	private Screen screen;
	
	public RollUpCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.rollUp();
	}
}

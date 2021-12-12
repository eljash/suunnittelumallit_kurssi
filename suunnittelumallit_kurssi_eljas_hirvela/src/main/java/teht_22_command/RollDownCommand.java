package main.java.teht_22_command;

/**
 * Komento jolla valkokangas lasketaan
 * @author Eljas
 *
 */
public class RollDownCommand implements Command {
private Screen screen;
	
	public RollDownCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.rollDown();
	}
}

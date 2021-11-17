package main.java.teht_08;

public class main {

	public static void main(String[] args) {

		Game game1 = new TicTacToe();
		/*
		 * TicTacToe toimii vain kahdella pelaajalla
		 */
		game1.playOneGame(2);
		
		Game game2 = new RollTheDice();
		/*
		 * RollTheDice toimii niin monella pelaajalla kuin halutaan
		 */
		game2.playOneGame(10);
	}

}

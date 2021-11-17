package main.java.teht_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RollTheDice extends Game {
	private List<Integer> outcome = new ArrayList<Integer>();
	/*
	 * Tällä muuttujalla varmistutaan, että pelaajat eivät ala
	 * heittämään uusia kierroksia
	 */
	private int players;
	private boolean endOfGame = false;
	/*
	 * Tähän merkkijonoon talletetaan voittoteksti, jolloin
	 * voittajia ei tarvitse laskea, kuin kerran pelin päätyttyä
	 */
	private String winnerText = "";
	
	/*
	 * Apumuuttuja, kun voittajia lasketaan
	 */
	private int highestNumber = 0;
	private Scanner scan = new Scanner(System.in);
	
	@Override
	void initializeGame() {
		outcome.clear();
		players = -1;
		endOfGame = false;
		winnerText = "";
	}

	@Override
	void makePlay(int player) {
		if(player>players) {
			players++;
			System.out.println("Player"+(player+1)+":s turn. Press any button.");
			scan.nextLine();
			int diceValue = ThreadLocalRandom.current().nextInt(1, 6 + 1);
			if(diceValue>highestNumber)
				highestNumber = diceValue;
			outcome.add(diceValue);
			System.out.printf("Player %d threw %d%n",player+1,diceValue);
		} else {
			calculateWinners();
			endOfGame = true;
		}
		
	}
	
	private void calculateWinners() {
		if(outcome!=null) {
			for(int i = 0; i < outcome.size(); i++) {
				if(outcome.get(i)==highestNumber) {
					winnerText+="Player "+(i+1)+" won by throwing "+outcome.get(i)+"\n";
				}
			}
		}
	}

	@Override
	boolean endOfGame() {
		return endOfGame;
	}

	@Override
	void printWinner() {
		System.out.println(winnerText);
		
	}

}

package main.java.teht_08;

import java.util.Scanner;

public class TicTacToe extends Game {
	
	private boolean gameEnded = true;
	private int winner = 0;
	
	/*
	 * merkkijoukko, mihin kirjoitetaan X tai O.
	 * '-' merkki kuvastaa, että ruutu on ryhjä
	 */
	private char[] grid = new char[] {
			'-','-','-',
			'-','-','-',
			'-','-','-'
		};
	
	/*
	 * Jokaiselle "grid" merkkijoukko indeksiä kuvaava 
	 * merkkijono
	 */
	private String[] gridCodes = new String[] {
			"a1","b1","c1",
			"a2","b2","c2",
			"a3","b3","c3"
	};
	
	/*
	 * Kaikki mahdolliset voitto rivit. Numero 
	 * kuvastaa indeksiä "grid" merkkijoukossa
	 */
	private int[][] winLines = new int[][] {
		{
			0,1,2
		},
		{
			3,4,5
		},
		{
			6,7,8
		},
		{
			0,3,6
		},
		{
			1,4,7
		},
		{
			2,5,8
		},
		{
			0,4,8
		},
		{
			2,4,6
		}
	};

	@Override
	void initializeGame() {
		gameEnded = false;
		grid = new char[] {
			'-','-','-',
			'-','-','-',
			'-','-','-'
		};
		System.out.println("\n Guide: enter grid in format a1, b3...");
		drawGrid();
	}

	@Override
	void makePlay(int player) {
		String input;
		Scanner scanner = new Scanner(System.in);
		boolean onGoing = true;
		/*
		 * Pysytään while-silmukassa, kunnes käyttäjä syöttää
		 * hyväksyttävän syötteen
		 */
		while(onGoing) {
			String whosTurn = "";
			if(player==0)
				whosTurn = "X-player";
			else
				whosTurn = "O-player";
			System.out.println("\n"+whosTurn+" enter coordinates:");
			input = scanner.nextLine();
			
			/*
			 * Varmistetaan, että syötteen pituus on 2, sillä
			 * hyväksyttävät syötteet ovat muotoa a1, b3, c2...
			 */
			if(input.length()==2) {
				/*
				 * Käydään kaikki koordinaatti arvot läpi, kunnes
				 * löydetään käyttäjän syötettä vastaava
				 * koordinaatti 'gridCodes'-joukosta
				 */
				for(int i = 0; i < gridCodes.length; i++) {
					if(input.equals(gridCodes[i])) {
						/*
						 * Koortinaatti joukon indeksi vastaa 
						 * grid-merkkijoukon indeksiä. Tässä
						 * katsotaan, onko tämä grid-joukon indeksi
						 * tyhjä eli '-', jolloin siihen lisätään
						 * pelaajan merkki. Muuten pyydetään
						 * syöttämään uudestaan
						 */
						if(grid[i] == '-') {
							char charToWrite;
							if(player==0)
								charToWrite='X';
							else
								charToWrite='O';
							grid[i] = charToWrite;
							onGoing = false;
						} else {
							System.out.println("Gird is already in use.");
							break;
						}
					}
				}
			} else {
				System.out.println("Input should be in format of: a2, b3...");
			}
		}
		
		drawGrid();
		checkForLines();
		
	}

	@Override
	boolean endOfGame() {
		return gameEnded;
	}

	@Override
	void printWinner() {
		if(endOfGame()) {
			String winText = "\n\n";
			
			/*
			 * Jos taulukko täyttyy ilman mitään voittorivejä.
			 */
			if(winner==-1) {
				System.out.println("Game ended without a winner...");
				return;
			}
			else if(winner==0)
				winText+="X-";
			else
				winText+="O-";
			winText+="wins the game!";
			System.out.println(winText);
		}
		
	}
	
	private void checkForLines() {
		/*
		 * Katsotaan winLines-joukosta kaikki
		 * mahdolliset voitto linjat ja katsotaan,
		 * onko jommalla kummalla pelaajista voittolinja
		 */
		for(int[] line : winLines) {
			int x = 0;
			int o = 0;
			
			for(int index : line) {
				if(grid[index]=='-')
					break;
				if(grid[index]=='X') {
					x++;
				}
				else if(grid[index]=='O') {
					o++;
				}
			}
			
			/*
			 * Katsotaan onko X tai O merkkejä 
			 * voittolinjassa kolme kappaletta
			 */
			if(x==3) {
				winner = 0;
				gameEnded=true;
				return;
			} else if (o == 3) {
				winner = 1;
				gameEnded=true;
				return;
			}
		}
		int totalO = 0;
		int totalX = 0;
		for(char x : grid) {
			if(x=='X')
				totalX++;
			else if(x=='O')
				totalO++;
		}
		if(totalO+totalX==grid.length+1) {
			winner=-1;
			gameEnded=true;
		}
	}
	
	private void drawGrid() {
		System.out.println("  a b c");
		try {
			System.out.printf("1 %c %c %c",grid[0],grid[1],grid[2]);
			System.out.printf("\n2 %c %c %c",grid[3],grid[4],grid[5]);
			System.out.printf("\n3 %c %c %c",grid[6],grid[7],grid[8]);
		} catch (NullPointerException e) {
			System.out.println("Error, game grid not initialized.");
		}
	}

}
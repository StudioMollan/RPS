package rpc;

import java.util.Scanner;

public class RPC {
	// for clarification of the outcome/winner. see further down. 
	final static int ROCK = 1, SCISSOR = 2, PAPER = 3;
	public static void main(String[] args) {
		// getting input to the sofware
		Scanner reader = new Scanner(System.in);
		
		// declaration of the game with optional rules.
		System.out.println("The game is Rock, Paper, Scissors.");
		System.out.println();
		System.out.println("Do you wish to read the rules? type Yes or No");
		String rulesInput = reader.nextLine();
		if (rulesInput.equalsIgnoreCase("yes")) {
			System.out.println("ok....... here we go.......");
			rules();
		} else if (rulesInput.equalsIgnoreCase("no")) {
			System.out.println("Then we are ready to go. ");
		} else {
			System.out.println("You've written something silly. Here are the rules anyways ");
			rules();
			System.out.println("Lets proceed. ");
		}
		// Lets the two players state their names
		System.out.println("Player one, type your name. ");
		String p1name = reader.nextLine();
		System.out.println("You choose the name " + p1name);
		
		System.out.println("Player two, type your name. ");
		String p2name = reader.nextLine();
		System.out.println("You choose the name " + p2name + "\n");
		
		// while loop for returning the players to the game without the rules and naming process. 
		boolean isRunning = true;
		while (isRunning) {
			//the string move is collected. can be either numerical or with letters. 
			System.out.println(p1name + " Type 1 for Rock, 2 for Paper or 3 for Scissor, or write with letters. ");
			String move1 = reader.nextLine();

			// Converts the string moveX to an integer, 1, 2 or 3
			int pOnePlay = 0;
			while (pOnePlay == 0) {
				if (move1.equalsIgnoreCase("1")) {
					pOnePlay = 1;
				} else if (move1.equalsIgnoreCase("rock")) {
					pOnePlay = 1;
				} else if (move1.equalsIgnoreCase("2")) {
					pOnePlay = 2;
				} else if (move1.equalsIgnoreCase("paper")) {
					pOnePlay = 2;
				} else if (move1.equalsIgnoreCase("3")) {
					pOnePlay = 3;
				} else if (move1.equalsIgnoreCase("scissor")) {
					pOnePlay = 3;
				} else {
					System.out.println("You wrote something silly, please try again");
					pOnePlay = 0;
				}
			}
			hide(10);
			// same for player 2
			System.out.println(p2name + " Type 1 for Rock, 2 for Paper or 3 for Scissors, or write with letters. ");
			String move2 = reader.nextLine();
			// same for player 2
			int pTwoPlay = 0;
			while (pTwoPlay == 0) {
				if (move2.equalsIgnoreCase("1")) {
					pTwoPlay = 1;
				} else if (move2.equalsIgnoreCase("rock")) {
					pTwoPlay = 1;
				} else if (move2.equalsIgnoreCase("2")) {
					pTwoPlay = 2;
				} else if (move2.equalsIgnoreCase("paper")) {
					pTwoPlay = 2;
				} else if (move2.equalsIgnoreCase("3")) {
					pTwoPlay = 3;
				} else if (move2.equalsIgnoreCase("scissor")) {
					pTwoPlay = 3;
				} else {
					System.out.println("You wrote something silly, please try again");
					pTwoPlay = 0;
				}
			}
			hide(10);
			// if, switch to calculae the outcome of the game. 
			if (pOnePlay == pTwoPlay) {
				System.out.println("It's a draw, try again." + "\n");
			} else {
				switch (pOnePlay) {
				case ROCK:
					if (pTwoPlay == SCISSOR) {
						System.out.println(p1name + " is the winner!");
						break;
					} else {
						System.out.println(p2name + " is the winner!");
						break;
					}
				case SCISSOR:
					if (pTwoPlay == PAPER) {
						System.out.println(p1name + " is the winner!");
						break;
					} else {
						System.out.println(p2name + " is the winner!");
						break;
					}
				case PAPER:
					if (pTwoPlay == ROCK) {
						System.out.println(p1name + " is the winner!");
						break;
					} else {
						System.out.println(p2name + " is the winner!");
						break;
					}
				}

			}
			// Here you can choose to play again without naming players or viewing rules. 
			System.out.println("do you want to play again? yes or no. Or type rules to see the rules and play again. ");
			String playAgain = reader.nextLine();
			if (playAgain.equalsIgnoreCase("yes")) {
				System.out.println("Ok, here we go again.");
			} else if (playAgain.equalsIgnoreCase("no")) {
				System.out.println("Then i guess this is it, hope you had fun!!");
				isRunning = false;
			} else if(playAgain.equalsIgnoreCase("rules")) {
				rules();
			}else {
				System.out.println("You've written something silly so you will be kicked out!");
				isRunning = false;
			}
		}

	}
	// for hiding the input between players. Sets a number of blank lines to scroll out of view.  
	public static void hide(int i) {

		while (i >= 1) {
			i--;
			System.out.println();

		}
	}
	// states the rules. 
	public static void rules() {
		System.out.println("Rock beats Scissor, Scissor beats Paper, Paper beats Rock.");
		System.out.println();

	}

}

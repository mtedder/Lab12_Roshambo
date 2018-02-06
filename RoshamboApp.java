/**
 * 
 */
package com.jb.lab12a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Maurice Tedder Lab 12 Create a rock, paper, scissors game
 */
public class RoshamboApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare and create opponent choice array
		String[] opponents = { "Human", "Random", "Rock" };
		// Choice options for player choice menu
		Map<String, String> playerChoiceMenu = new HashMap<String, String>();
		playerChoiceMenu.put("r", "Rock");
		playerChoiceMenu.put("p", "Paper");
		playerChoiceMenu.put("s", "Scissors");

		// create scanner object
		Scanner scan = new Scanner(System.in);
		// Display welcome message
		System.out.println("Welcome to Rock Paper Scissors!");

		// Prompt user for name and accept input
		System.out.print("Enter your name:");
		String playerName = scan.nextLine();
		System.out.println();// newline

		// create opponent

		boolean condition = true;// continue loop flag
		while (condition) {
			// Prompt user to pick opponent and accept input
			System.out.print("Pick 1. RandomPlayer or 2. RockPlayer for your opponent:");
			int opponentChoice = scan.nextInt();
			scan.nextLine();// consume garbadge character
			System.out.println();// newline

			// Prompt user for game choice and accept input
			System.out.print("Do you want Rock, paper, or scissors? (R/P/S)");
			String playerChoice = scan.nextLine().toLowerCase();
			// convert user string choice to Roshambo
			Roshambo playerRoshChoice = Roshambo.valueOf(playerChoiceMenu.get(playerChoice));
			System.out.println();// newline

			// Display result of match
			// create human player
			Player humanPlayer = PlayerFactory.getInstance("Human");
			// set name
			humanPlayer.setName(playerName);
			humanPlayer.setRosh(playerRoshChoice);
			
			//Create opponent - using polymorphism here
			Player opponentPlayer = PlayerFactory.getInstance(opponents[opponentChoice]);
			opponentPlayer.generateRoshambo();// generate roshambo

			// display choices
			System.out.println(humanPlayer.getName() + ":" + humanPlayer.getRosh());
			System.out.println(opponentPlayer.getName() + ":" + opponentPlayer.getRosh());
			
			// Determine winner and display results
			// Calculate winner
			switch (humanPlayer.compareTo(opponentPlayer)) {
			case 0:
				System.out.println("Draw");
				break;
				
			case 1:
				System.out.println("You Win!");
				// winCount++;
				break;

			default:
				System.out.println("You lose!\n");
				// loseCount++;
				break;
			}
			
			// Prompt user to continue
			System.out.println("Play Again? (y/n)");
			String userChoice = scan.nextLine();
			if (userChoice.equalsIgnoreCase("n")) {
				condition = false;
			}
		}
		// display exit message
		System.out.println("Game over Dude!");
	}
}

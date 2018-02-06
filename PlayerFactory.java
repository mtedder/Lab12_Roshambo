/**
 * 
 */
package com.jb.lab12a;

/**
 * @author Maurice Tedder Factory class for creating various Player classes
 */
public class PlayerFactory {
	/*
	 * Create instance of requested player and return
	 */
	public static Player getInstance(String typeOfPlayer) {
		Player playerInstance = null;		
		switch (typeOfPlayer) {
		case "Human":
			playerInstance = new HumanPlayer();
			break;

		case "Rock":
			playerInstance = new RockPlayer();
			break;

		case "Random":
			playerInstance = new RandomPlayer();
			break;

		default:
			break;
		}
		return playerInstance;
	}
}

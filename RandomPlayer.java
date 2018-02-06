/**
 * 
 */
package com.jb.lab12a;

import java.util.Random;

/**
 * @author Maurice Tedder
 * Roshambo opponent who always random Roshambo value
 *
 */
public class RandomPlayer extends Player {

	
	/**
	 * 
	 */
	public RandomPlayer() {
		setName("Random Guy");
	}

	/* (non-Javadoc)
	 * @see com.jb.lab12a.Player#generateRoshambo()
	 */
	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int randNum = rand.nextInt(2) + 1;
		setRosh(Roshambo.values()[randNum]);
		return getRosh();
	}

}

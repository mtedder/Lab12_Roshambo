/**
 * 
 */
package com.jb.lab12a;

/**
 * @author Maurice Tedder
 * 
 * Roshambo opponent who always returns rock
 *
 */
public class RockPlayer extends Player {
	
	

	/**
	 * 
	 */
	public RockPlayer() {
		setName("Rock");
	}

	/* (non-Javadoc)
	 * @see com.jb.lab12a.Player#generateRoshambo()
	 */
	@Override
	public Roshambo generateRoshambo() {
		setRosh(Roshambo.Rock);
		return Roshambo.Rock;
	}

}

/**
 * 
 */
package com.jb.lab12a;

/**
 * @author Maurice Tedder
 *
 */
public class HumanPlayer extends Player {

	/* 
	 * Return Roshambo value currently previously set using the 
	 * setRosh() method
	 * (non-Javadoc)
	 * @see com.jb.lab12a.Player#generateRoshambo()
	 */
	@Override
	public Roshambo generateRoshambo() {			
		return getRosh();
	}

}

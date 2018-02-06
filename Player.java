/**
 * 
 */
package com.jb.lab12a;

/**
 * @author Maurice
 *
 */
public abstract class Player {
	private String name;
	private Roshambo rosh;
	
	public abstract Roshambo generateRoshambo();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rosh
	 */
	public Roshambo getRosh() {
		return rosh;
	}

	/**
	 * @param rosh the rosh to set
	 */
	public void setRosh(Roshambo rosh) {
		this.rosh = rosh;
	}
	
	
	
	/*
	 * Determine winner of a match
	 */
	public int compareTo(Player player2) {
		if(this.getRosh().equals(Roshambo.Scissors) && player2.getRosh().equals(Roshambo.Paper)){
			return 1;
		}else if(this.getRosh().equals(Roshambo.Paper) && player2.getRosh().equals(Roshambo.Scissors)){
			return -1;
		}else if(this.getRosh().equals(Roshambo.Rock) && player2.getRosh().equals(Roshambo.Scissors)){
			return 1;
		}else if(this.getRosh().equals(Roshambo.Scissors) && player2.getRosh().equals(Roshambo.Rock)){
			return -1;
		}else if(this.getRosh().equals(Roshambo.Paper) && player2.getRosh().equals(Roshambo.Rock)){
			return 1;
		}
		return (this.getRosh()).compareTo(player2.getRosh());		
	}
}

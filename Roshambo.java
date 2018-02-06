/**
 * 
 */
package com.jb.lab12a;

/**
 * @author Maurice
 *
 */
public enum Roshambo {
	Rock{
		/* (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Awesome Rock Power";
		}		
	}
	, Scissors{
		/* (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Running with Scissors";
		}		
	}
	, Paper{
		/* (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Ouch, Paper cut with lemon juice in it.";
		}				
	};
}

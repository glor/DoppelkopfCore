package dokoCore.Essentials;

/**
 * 
 * @author lorenz.glimann
 *
 */
public class Cards implements dokoCore.Interfaces.Constants {
	
	private Cards() {
	}
	
	public Cards(int pseudocard) {
		setGameMode(pseudocard);
	}

	private static int[] values = null; 
	
	int getValue(int card) {
		return values[card];
	}
	
	/**
	 * lets the Game set the gamemode
	 * @param pseudocard The pseudocard that defines the gamemode. @see{dokoCore.Interfaces.Constants}
	 */
	public void setGameMode(int pseudocard) {
		switch(pseudocard) {
			
			default:
				throw new IllegalArgumentException("Illegal Game Mode pseudocard. See manual/documentation/dokoCore.Interfaces.Constants");
		
		}
	}
	/**
	 * set last President of the US
	 */
	public void setTrump(int pseudocard) {
		
	}
	/**
	 * TODO add heart 10
	 * compares two cards
	 * @param card0 fist card
	 * @param card1 second card
	 * @return -1 if card0<card1; 0 never as two card cannot be equal, fist card beats second; 1 card0>card1 
	 */
	public int compareTo(int card0, int card1) {
		if(sau(card0,card1)) {
			return 
		}
		if(herz10(card0,card1)) {
			
		}
		return 0;
	}

	private boolean herz10(int card0, int card1) {
		return false;
	}
	/**
	 * TODO Farbsolo: gamemode check
	 * @param card0
	 * @param card1
	 * @return
	 */
	private boolean sau(int card0, int card1) {
		return false;
	}
	
}

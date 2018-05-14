package CardBoi;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card testCard = new Card("3", "Clubs", 1);
		testCard.toString();
		
		testCard.setCard("King" , "Spades", 3);
		testCard.toString();
		
		testCard.setCard("Thot", "Comic Sans", 9000);
		testCard.toString();
	}
}

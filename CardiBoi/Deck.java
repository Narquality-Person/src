package CardBoi;

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;
	
	//Unit 9 - Array version of the Deck
	
	//private Card[] cards;
	//private String[] cRanks;
	//private String[] cSuits;
	//private int[] cValues;
	
	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	
	
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		/*cRanks = ranks;
		cRanks = new String[] {"4", "3", "2", "Ace"};
		
		cSuits = suits;
		cSuits = new String[] {"Clubs", "Spades", "Diamonds", "Hearts"};
		
		cValues = values;
		cValues = new int[] {4, 3, 2, 1};*/
		
		for (int s= 0; s< suits.length; s++)
		{
			for (int r = 0; r< ranks.length; r++)
			{
				Card test = new Card(ranks[r], suits[r], values[r]);
				cards.add(test);
			}
		}
		
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0)
		{
			return true;
		}
		else
			return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		Card[] shuffler = new Card[cards.size()];
		
		for(int i = 0; i<shuffler.length; i++)
		{
			int r = (int)(Math.random()*shuffler.length);
			while(shuffler[r] != null)
			{
				r = (int)(Math.random()*shuffler.length);
			}
			shuffler[r] = cards.get(i);
		}
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int ran = (int) (Math.random()*cards.size());
		//System.out.print(cards[ran]);
		return cards.get(ran);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";
		
		//Unit 9 - modify to work with Arrays
		
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		
		rtn = rtn + "\n";
		return rtn;
	}
}

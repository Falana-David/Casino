import java.util.Random;
import java.util.ArrayList;

//public static int money;
//public in
//public ArrayList<String> deck_of_cards;
//private int decklength;

public class Deck {

	private Deck[] Deck;

	public Deck() {
		/*
		 * ArrayList <String> deck_of_cards = new ArrayList <> ();
		 * deck_of_cards.add("Spades"); deck_of_cards.add("Hearts");
		 * deck_of_cards.add("Dimonds"); deck_of_cards.add("Clubs");
		 */

		this.Deck = new Deck[52];
		String[] suit = { "Spades", "Hearts", "Dimonds", "Clubs" };
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		/*
		 * for (int i = 1; i < 11; i++) { String value = Integer.toString(i);
		 * deck_of_cards.add(value);
		 * 
		 * deck_of_cards.add(value); deck_of_cards.add(value); deck_of_cards.add(value);
		 * 
		 * }
		 */

		for (int i = 0; i < suit.length; i++) {
			for (int n = 0; n < numbers.length; n++) {
				Card c = new Card(suit[i], numbers[n]);

			}
		}
	}

	/*
	 * public void Card(String string, int i) { // TODO Auto-generated constructor
	 * stub rnd = Card c }
	 */
}

import java.util.Random;
import java.util.ArrayList;


//public static int money;
//public in
//public ArrayList<String> deck_of_cards;
//private int decklength;
public class Deck {
	
	public Deck () {
		ArrayList <String> deck_of_cards = new ArrayList <> ();
		deck_of_cards.add("Spades");
		deck_of_cards.add("Hearts");
		deck_of_cards.add("Dimonds");
		deck_of_cards.add("Clubs");
		
		for (int i = 1; i < 11; i++)
		{
			String value = Integer.toString(i);
			deck_of_cards.add(value);
			deck_of_cards.add(value);
			deck_of_cards.add(value);
			deck_of_cards.add(value);
		}
		
	}
	
}

 


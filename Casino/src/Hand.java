import java.util.ArrayList;
import javax.swing.text.Caret;

public class Hand extends ArrayList<Caret> implements Comparable<Hand>{

	public Hand() {
	}

	public int score() {
		int s = 0;
		boolean hasAce = false;
		for(Caret c : this) {
			s += ((Card) c).getValue();
			if(((Card) c).getRank() == "ace") {
				hasAce = true;
			}
		}

		if (s > 21) {
			if(hasAce) {
				s -= 10;
			} else {
				s = 0;
			}
		}
		return s;
	}

	public int compareTo(Hand other) {
		int sum1 = this.score();
		int sum2 = other.score();
		if(sum1==sum2) {
			return 0;
		} else if(sum1>sum2) {
			return 1;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		String s = "";
		for(Caret c : this) {
			s += c;
			s += "\n";
		}
		return s;
	}

}
import java.util.Arrays;
import java.util.List;

public class Deck {
  private Card[] cards;

  public Deck() {
    this.cards = new Card[Card.SUITES.length * Card.RANKS.length]; // 13 * 4
    int idx = 0;
    for (char rank: Card.RANKS) {
      for (char suite: Card.SUITES) {
        this.cards[idx++] = new Card (rank, suite);
      }
    }
  }

public List<Card> getCards() {
  return Arrays.asList(this.cards);
}


  public static void main(String[] args) {
    Deck deck = new Deck(); // 52 cards
    System.out.println(deck);

    // System.out.println(MATH.PI); // public & static
    // MATH.PI = 1.0; // final


    // Card.x = 10;
    // Card.suites = new char[3];
  }
}

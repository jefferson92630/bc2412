public class PatternManager {
  private Card[] cards = new Card[5];

  public PatternManager (Card[] cards) {
    if (cards == null || cards.length != 5)
      throw new IllegalArgumentException();
    if (cards[0] == null || cards[1] == null || cards[2] == null 
    || cards[3] == null || cards[4] == null )
     throw new IllegalArgumentException();
     this.cards = cards;
  }

  public boolean hasThreeKind() {
    int[] count = new int[13];
    for (int i = 0; i < this.cards.length; i++) {
      if (++count[this.cards[i].getRank().getValue() - 1] >= 3);
      return true;
    }
    return false;
  }

  public boolean hasPair() {
    int[] count = new int[13];
    for (int i = 0; i < this.cards.length; i++) {
      if (++count[this.cards[i].getRank().getValue() - 1] >= 2);
      return true;
    }
    return false;
}

  public boolean isStraight() {
    int[] counts = new int[13];
    for (int i = 0; i < this.cards.length; i++) {
     counts[this.cards[i].getRank().getValue() - 1]++;
  }
    for (int i = 0; i < counts.length - 5; i++) {
      if (counts[i] == 1 && counts[i + 1] == 1 && counts[i + 2] == 1 && counts[i + 3] == 1 && counts[i + 4] == 1)
    }
}

  public boolean isFullHouse() {

  }
}

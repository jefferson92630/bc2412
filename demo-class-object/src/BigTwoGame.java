public class BigTwoGame {
  private Deck deck;
  private ShuffleManager shuffleManager;
  
  public BigTwoGame() {
    this.deck = new Deck();
    this.shuffleManager = new ShuffleManager(this.cards);
  }

  public void start() {
    this.shuffleManager.shuffle();
  }
}

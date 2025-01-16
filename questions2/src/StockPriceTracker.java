import java.time.LocalDate;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class StockPriceTracker {
  // code here: Design your PQ, so that it always poll the highest price first.
  public static class Stock {
    private LocalDate date;
    private double price;

    public Stock (LocalDate date, double price) {
      this.date = date;
      this.price = price;
    }

    public LocalDate getDate() {
      return this.date;
    }

    public double getPrice() {
      return this.price;
    }
  }

  public static class SortbyPrice implements Comparator<StockPriceTracker.Stock> {
    @Override
    public int compare(Stock s1, Stock s2) {
      return s1.getPrice() > s2.getPrice() ? -1 : 1;
    }
  }

  private final Queue<Double> maxPricePQ = new PriorityQueue<>(new SortbyPrice());
  private final Map<LocalDate, Double> tradeRecords = new HashMap<>();
  private final Deque<LocalDate> tradeDates = new LinkedList<>();

  public void addRecord(LocalDate date, double price) {
    // code here ...
    // 1. Add the trade record to the hashMap
    // 2. Add the price to PQ
    // 3. Add the trade date to Deque
    tradeRecords.put(date, price);
    maxPricePQ.add(price);
    tradeDates.add(date);
    System.out.println("Recorded: " + date + " -> $" + price);
  }

  public double getLatestPrice() {
    // code here ...
    // Tips: use tradeDates & tradeRecords
    return tradeRecords.get(tradeDates.pollLast());
  }

  public double getHighestPrice() {
    // code here ...
    // Tips: use maxPricePQ
    return tradeRecords.get(maxPricePQ.poll());
  }

  public static void main(String[] args) {
    StockPriceTracker tracker = new StockPriceTracker();
    // Assume we put the records in order of trade date
    tracker.addRecord(LocalDate.of(2024, 1, 1), 100.50);
    tracker.addRecord(LocalDate.of(2024, 1, 2), 200.75);
    tracker.addRecord(LocalDate.of(2024, 1, 3), 150.25);
    tracker.addRecord(LocalDate.of(2024, 1, 4), 199.99);
    System.out.println("Latest price: $" + tracker.getLatestPrice()); // Output: 199.29
    System.out.println("Highest price: $" + tracker.getHighestPrice()); // Output: 200.75
  }

}
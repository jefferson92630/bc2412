import javax.naming.spi.ObjectFactoryBuilder;

public enum OrderStatus {
  PAID(1), READY_FOR_SHIP(2), DELIVERING(3), DELIVERED(4),;

  private final int value;

  private OrderStatus(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }


// Delivered.next() -> null
  public OrderStatus next() {
    for (OrderStatus o : values()) {
      if (o.getValue() == this.value + 1)
      return o;
    }
    return null;
  }

    public static void main(String[] args) {
      System.err.println(OrderStatus.PAID.next()); // toString()
      System.out.println(OrderStatus.PAID.name());

      System.out.println(OrderStatus.valueOf("PAID") == OrderStatus.PAID); // true
     // System.out.println(OrderStatus.valueOf("paid") == OrderStatus.PAID); // error
    }
}

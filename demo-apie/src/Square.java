import java.math.BigDecimal;

public class Square extends Shape {
  private double length;


  public Square (Color color, double length) {
    super(color);
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  public double area() {
    return BigDecimal.valueOf(this.length)
    .multiply(BigDecimal.valueOf(this.length))
    .doubleValue();
    
  }

  public static void main(String[] args) {
    Square s1 = new Square(Color.RED, 5.6);
    System.out.println(s1.getColor());
    System.out.println(s1.area());
  }
}

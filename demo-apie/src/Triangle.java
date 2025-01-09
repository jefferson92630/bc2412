import java.math.BigDecimal;

public class Triangle extends Shape {
  private double baseLength;
  private double height;
  

  public Triangle (Color color, double baseLength, double height) {
    super(color);
    this.baseLength = baseLength;
    this.height = height;
  }

  public double getBaseLength() {
    return this.baseLength;
  }

  public double getHeight() {
    return this.height;
  }

  public double area() {
    return BigDecimal.valueOf(this.baseLength)
    .multiply(BigDecimal.valueOf(this.height))
    .divide(BigDecimal.valueOf(2.0))
    .doubleValue();
  }


  public static void main(String[] args) {
    Triangle t1 = new Triangle(Color.YELLOW, 10.4, 8.6);
    System.out.println(t1.getColor());
    System.out.println(t1.area());
  }
}

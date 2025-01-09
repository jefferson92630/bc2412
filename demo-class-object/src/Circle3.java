import java.math.BigDecimal;

public class Circle3 {
  private double radius;
  // private String color;


  public Circle3(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  // instance method
  public double calculateArea() {
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }

// static method: Cannot call "this"
// Design definition:

  public static double calculateArea2(double radius) {
    return BigDecimal.valueOf(radius) //.
    .multiply(BigDecimal.valueOf(radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }

  public static void main(String[] args) {
    // area
    // BigDecimal

    Circle3 c1 = new Circle3 (3.0);
    // Presentation
    System.out.println(c1.calculateArea()); // ~28.27

    // Formula
    System.out.println(Circle3.calculateArea2(3.0)); // ~28.27
    
  }

}

import java.math.BigDecimal;
import java.util.Objects;

// Why do we need Shape (Parent Class)?
public class Circle extends Shape { // Parent Class: color
  // Square.class, Triangle.class
  private double radius;

  // If you don't specify the constructor, implicitly you have a default empty constructor
  public Circle(Color color, double radius) {
    // if you don't specify super() here, implicitly you are calling super()
    super(color);
    // super(color); // because you have "extends", you have to "super"
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  // Override the parent given method
  // complier will help to check if the parent class has a area() method
  public double area() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if(!(obj instanceof Circle))
    return false;
    Circle circle = (Circle) obj;
    return Objects.equals(circle.getRadius(), this.radius) && 
    Objects.equals(circle.getColor(),super.getColor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius, super.getColor());
}

  @Override
  public String toString() { // for debug mainly
    return "Circle[" //
        + "radius=" + this.radius
        +", color=" + super.getColor()
        +"]";
}

  public static void main(String[] args) {
    // new Circle(); 
    // after you specify a constructor,
    // then the default constructor will no longer exists.
    Circle c1 = new Circle (Color.YELLOW, 4.6 );
    Circle c2 = new Circle (Color.BLUE, 4.6 );
    System.out.println(c1.getColor());
    System.out.println(c1.area());

    System.out.println(c1.equals(c2)); // false (before override)/ true (after override)
    System.out.println(c1.hashCode()); // 1392838282 (before override)/ -1473533893 (after override)
    System.out.println(c2.hashCode()); // 523429237 (before override)/ -1473533893 (after override)

    System.out.println(c1); // Circle[radius=4.6, color=Blue]
    System.out.println(c2); // Circle[radius=4.6, color=Blue]
  }

}

public abstract class Shape {
  // abstract class vs class
  // 1. CANNOT create object for abstract class
  // 2. they are both with common attribute for child class
  // 3. abstract class's constructor is for child class to "super"
  private Color color;


  public Shape (Color color) {
  this.color = color;
}

  public Color getColor() {
  return this.color;
}

  // implicitly public for abstract method
  // Implication: 
  // 1. If the child class cannot provide area implementation, then it is not a shape.
  // 2. the child class must provide the implementation of abstract method
  abstract double area();


  public static Shape create(String ref, Color color) { 
    switch(ref) {
      case "Square":
      return new Square(color, 3.0);
      case "Circle":
      return new Circle(color, 4.0);
      default:
      return null;
    }

  }

  public static Circle createCircle(Color color, double radius) {
    return new Circle(color, radius);
  }

public static void main(String[] args) {
  // new Shape ("Red") // complie error, abstract class
  System.out.println(Shape.create("Square", Color.RED));
  Circle c2 = Shape.createCircle(Color.RED, 3.0);
  System.out.println(c2);
}

}

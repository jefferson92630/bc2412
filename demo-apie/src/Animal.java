public class Animal implements Eatable {
  // common attributes of Cat and Dog
  private String name;

public Animal() {
  
}

  public Animal (String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // Contract content
  @Override
  public void eat() {
    System.out.println("Animal is eating ......");
  }

  public static void main(String[] args) {
    
    Cat cat = new Cat("Jimmy", 3);
    System.out.println(cat.getName()); // Jimmy

   
    Animal cat2 = new Cat("Mary", 2);
    cat2.eat(); // Cat is eating......

    // Rule 1. During the compile time, 
    // "Animal cat2" imply the object can be accessed in "Animal Scope"
    // Hide the object instance method walk() & sleep()
    // cat2.sleep(); // cannot pass through compile time.


    // Rule 2. Runtime
    cat2.eat(); // Find the object during runtime.
    // Found that the object actually is a cat object.
    // So cat2.eat() -> Cat.class's eat()

    Animal cat3 = new Animal("Vincent");
    cat3.eat(); // Animal is eating

    // cat3.sleep(); // because Animal.class does not have sleep(), violate rule 1

    // Cannot place an Parent object to a child referece
    // Cat cat4 = new Animal("Lucas");

    // Example 1:
    Animal[] animals = new Animal[4]; // Cat, Dog, Pig
    animals[0] = new Cat("ABC", 2);
    animals[1] = new Dog("DEF");
    animals[2] = new Pig("IJK");
    animals[3] = new Animal("XYZ"); // what if the animal.class is abstract?

    Cat[] cats = new Cat[3];
    cats[0] = new Cat("123", 2);

    // Example 2:
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(Color.RED, 4.0);
    shapes[1] = new Square(Color.RED, 3.0);
    shapes[2] = new Square(Color.BLUE, 4.8);

    for(Shape shape : shapes) {
      System.out.println(shape.area());
    }


    // Example 3:
    for (Shape shape : shapes) {
      if (shape instanceof Circle) { // check if shape is instance of Circle?
      Circle circle = (Circle) shape; // similar to "double y = 2.0; int x = (int) y;"
      System.out.println(circle.getRadius()); // Rule 1
      } else if (shape instanceof Square) {
        Square square = (Square) shape;
        System.out.println(square.getLength()); // comply with Rule 1
      }
    }

    // Example 4: for Interface
    Eatable cat4 = new Cat("Tommy", 9);
    cat4.eat(); // cat is eating .....

    Sleepable[] animals2 = new Sleepable[3];
    animals2[0] = new Cat("Steve", 2);
    animals2[1] = new Dog("Owen");
    // animals2[2] = new Animal(); // Animal didn't implement Eatable

    animals2[1].sleep();
    animals2[0].sleep();;
    // animals2[0].eat();



  }
}

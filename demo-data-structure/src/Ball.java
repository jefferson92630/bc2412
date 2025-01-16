import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;
  
  public static enum Color {
    RED, YELLOW, BLUE,;
  }

  public Ball (Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public int compareTo(Ball ball) {
    // Compare two balls
    // this.ball (-1), ball(1)

    // Our Task, lower value, return first
    // if (this.value < ball.getValue())
    // return -1;
    // return 1;

    // order by color: RED, BLUE, YELLOW. For same color, descending order of value
    if (this.color == ball.getColor()) {
      if (this.value > ball.getValue())
      return -1;
      else
      return 1;
    }

    if (this.color == Color.RED)
    return -1;
    if (ball.getColor() == Color.RED)
    return 1;
    if (this.color == Color.BLUE)
    return -1;
    return 1;
  }

  @Override
  public String toString() {
    return "Ball[" + 
          "color=" + this.color
          +",value=" + this.value
          +"]";
  }

  public static void main(String[] args) {
    // Ball List
    // RED 1
    // YELLOW 9
    // BLUE 7
    // YELLOW 3
    // RED 8

    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Ball.Color.RED, 1)); // or no need Ball. as enum Color is private attribute within the class
    balls.add(new Ball(Color.YELLOW, 9));
    balls.add(new Ball(Color.BLUE, 7));
    balls.add(new Ball(Color.YELLOW, 3));
    balls.add(new Ball(Color.RED, 8));

    // Sort by Values
    // Approach 1: Comparable<Ball>. Disadvantages: one rule of sort
    Collections.sort(balls);
    System.out.println(balls);
    // [Ball[color=RED,value=1], Ball[color=YELLOW,value=3], Ball[color=BLUE,value=7], 
    // Ball[color=RED,value=8], Ball[color=YELLOW,value=9]]


    // Approach 2: Comparator
    Comparator<Ball> sortFormula; 
    int x = 1;
    if (x > 2) {
      sortFormula = new SortByColor();
    } else {
      sortFormula = new SortByValue();
    }
    Collections.sort(balls, sortFormula);
    System.out.println(balls); // [Ball[color=YELLOW,value=9], Ball[color=RED,value=8], Ball[color=BLUE,value=7], Ball[color=YELLOW,value=3], Ball[color=RED,value=1]]


  }

}

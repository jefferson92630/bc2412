import java.math.BigDecimal;
import java.math.RoundingMode;

public class People {
  // attribute
  private double height; // instance variable
  private double weight; // instance variable
  private char gender;

  // can be more than one constructor
  public People (double height, double weight, char gender) {
    this.height = height;
    this.weight = weight;
    this.gender = gender;
  }

  // Empty constructor
   public People () {

   }

  // Constructor is same as method. Not allow same constructor signature.

  // public People (double height) {
  //  this.height = height;
  // }

  // public People (double weight) {
  //  this.weight = weight;
  // }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public char getGender() {
    return this.gender;
  }

    // static method
    public static double bmi2(double height, double weight) {
      return BigDecimal.valueOf(weight)
      .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2, 
        RoundingMode.HALF_UP)
      .doubleValue();
      }

    // instance method
    public double bmi() {
      return BigDecimal.valueOf(this.weight)
      .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP)
      // .setScale(2, RoundingMode.HALF_DOWN) // for other operation, +, -, *
      .doubleValue();
    }

    // instance method
    // Able to call object attribute & instance method
    public String bmiIndex() {
      double bmiValue = this.bmi();
      if (bmiValue < 18.5) {
        return "Under Weight";
      } else if (bmiValue >= 18.5 && bmiValue <= 24.9) {
        return "Normal";
      } else if (bmiValue >= 25.0 && bmiValue <= 29.9) {
        return "Overweight";
      } else if (bmiValue >= 30.0 && bmiValue <= 34.9) {
        return "Obese";
      } else {
        return"Extremely Obese";
      }
      }


    public static void main(String[] args) {
      People p1 = new People(1.74, 68, 'M');

      // from instance method
      System.out.println(p1.bmiIndex()); // Normal
      System.out.println(p1.bmi()); // 22.46

      // from static method
      System.out.println(People.bmi2(1.74, 68)); // 22.46

    // Constructor object by empty constructor
      People p2 = new People();
      System.out.println(p2.getHeight()); // 0.0
      System.out.println(p2.getWeight()); // 0.0
      System.out.println(p2.getGender());

      if (p2.getGender() == '\u0000') { // different to ' ', which means space
        System.out.println("char's default value");
      }

      double x;
      // for local variable, you cannot get thr value before initialization.

    }

  }

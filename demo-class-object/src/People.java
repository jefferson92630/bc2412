import java.math.BigDecimal;
import java.math.RoundingMode;

public class People {
  // attribute
  private double height; // instance variable
  private double weight; // instance variable

  public People (double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

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

      // static method
    public static double bmi2(double height, double weight) {
      return BigDecimal.valueOf(weight)
      .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2, 
        RoundingMode.HALF_UP)
      .doubleValue();
    }

    public static void main(String[] args) {
      People p1 = new People(1.74, 68);
      System.out.println(p1.bmiIndex()); // Normal
      System.out.println(p1.bmi()); // 22.46
      System.out.println(People.bmi2(1.74, 68));

    }

  }

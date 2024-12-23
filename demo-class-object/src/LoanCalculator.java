import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numOfYears;

  // constructor
  // totalInterestAfterYears()

  public LoanCalculator(double principle, double annualInterestRate, int numOfYears) {
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numOfYears = numOfYears;
  }

  // principle * (1 + (annualInterestRate/100)^numOfYears) - principle
    public double totalInterestAfterYears() {
      return BigDecimal.valueOf(this.principle)
      .multiply(BigDecimal.valueOf(Math.pow((1 + this.annualInterestRate/ 100.0), this.numOfYears)))
      .subtract(BigDecimal.valueOf(this.principle))
      .setScale(2, RoundingMode.HALF_UP)
      .doubleValue();
    }

    public static double totalInterestAfterYears(double principle, double annualInterestRate, int numOfYears) {
      return BigDecimal.valueOf(principle)
      .multiply(BigDecimal.valueOf(Math.pow((1 + annualInterestRate/ 100.0), numOfYears)))
      .subtract(BigDecimal.valueOf(principle))
      .setScale(2, RoundingMode.HALF_UP)
      .doubleValue();
    }


    public static void main(String[] args) {
      LoanCalculator lc = new LoanCalculator(3000, 4.6, 5);
      System.out.println(lc.totalInterestAfterYears());
      System.out.println(LoanCalculator.totalInterestAfterYears(3000, 4.6, 5));
      
    }
  }


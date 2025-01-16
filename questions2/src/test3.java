import java.util.Scanner;

public class test3 {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge(). 
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    String ageInput = scanner.nextLine();

    try {
      // Attempt to check age
      int age = checkAge(ageInput);
      System.out.println("Age " + age + " is accepted.");
    } catch (InvalidAgeException e) {
      System.out.println("Age is invalid. Please input again later.");
    } catch (NumberFormatException e) {
      System.out.println("Error: Please enter a valid number.");
    } finally {
      scanner.close();
    }
  }

  // Custom exception class
  public static class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
      super(message);
    }
  }

  // Static method to check age
  public static int checkAge(String ageInput) throws InvalidAgeException, NumberFormatException {
    int age = Integer.parseInt(ageInput);
    if (age < 18) {
      throw new InvalidAgeException("Age less than 18 is not allowed.");
    }
    return age;
  }
}

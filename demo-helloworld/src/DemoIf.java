public class DemoIf {
  public static void main(String [] args) {
    // If -> check event -> event result
    int x = 3;
    if (x > 2) { // "x > 2" is an event -> true/false
    System.out.println("x is > 2");
  }

    String s = "hello";
    // check if length > 3
    if(s.length() > 3) {
      System.out.println("s.length() > 3");
    }

    // equals(), charAt()
    if ("hello".equals(s)) {
      System.out.println("s equals to hello");
    }

    if (s.charAt(1) == 'e') {
      System.out.println("The char at index 1 = e"); // must need to be true to generate result
    }

    if (x > 5) {
      System.out.println("x > 5.");
    } else { // x <= 5
        System.out.println("x <= 5.");
      }

      int y = 10;
      // check if y is an even number
      if (y % 2 == 0) {
        System.out.println("it is an even number");
      }
      if (y % 2 == 1) {
        System.out.println("it is an odd number");
      }
      // check if y > 3 and y is even number

      if (y > 3 && y % 2 ==0) {
        System.out.println("y > 3 and y is an even number.");
      }

      char k = 'k';
      if (k == 'k') {
        System.out.println("it is k.");
      }

      int age = 17;
      boolean isAdult = age >= 18;

      if (isAdult == false) {
        System.out.println("It is not an adult");

      }
      if (!isAdult){
        System.out.println("It is not an adult");
      }

      int score = 86;
      char gender = 'F';
      // score >= 90, grade A
      // ! score between 85 and 89 for female, grade T
      // ! score between 87 and 89 for male, grade T
      // ! score between 80 and 84 for female, grade B
      // ! score between 80 and 86 for male, grade B
      // score between 70 and 79, grade C
      // under 70, grade F
      char grade = ' ';
      if (score >= 90) {
        grade = 'A';
      } else if (score >= 85 && score <= 89 && gender == 'F' 
        || score >= 87 && score <= 89 && gender == 'M' ) {
        grade = 'T';
      } else if (score >= 80 && score <= 84 && gender == 'F' 
        || score >= 80 && score <= 86 && gender == 'M') {
        grade = 'B';
      } else if (score >= 70 && score <= 79) {
        grade = 'C';
      } else { // or use else if
        grade = 'F';
      }
      System.out.println(grade); // c

      // test cases
      // 1. M 90 -> A
      // 2. F 90 -> A
      // 3. M 86 -> B
      // 4. F 86 -> T
      // 5. M 85 -> B
      // 6. F 85 -> T
      // 7. M 79 -> C
      // 8. F 79 -> C
      // 9. M 69 -> F
      // 10. F 69 -> F

    }
  }


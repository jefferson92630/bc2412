import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    }


    // ! While Loop vs For Loop
    int j = 0; // 1. declare the counter outside the loop
    while (j < 3) {  // continue criteria
      System.out.println(j);
 
      j++; // ! 2. flexible to control the j
      j++;
      j++; // When j added three times, the loop stops, because already reach the 3
    }

    String s = "hello";
    char target = 'e';
    // while
    int k = 0;
    boolean found = false;
    while (k < s.length()) {
    if ((s.charAt(k) == target)) {
      found = true;
    }
      k++;
  }
  System.out.println(found);

      // for loop
      for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == target) {
        found = true;
      System.out.println(found);
     }
    }
    // Random
    int number = new Random().nextInt(3); // 0-2
    System.out.println(number); // random number

    int marksix = new Random().nextInt(49) + 1; // (0-48) + 1
    // 1-49
    System.out.println(marksix); // random number

    int [] marksixArr = new int [6];
    int count = 0;
    int value = 0;
    while (count < marksixArr.length) { // count < 6
    value = new Random().nextInt(49) + 1; // 1 - 49
      if (!isDuplicated(marksixArr, value)) {
        marksixArr[count] = value;
        count++;
      }
    }
    System.out.println(Arrays.toString(marksixArr)); // random: [x, x, x, x, x, x]
  
    // 1 - 100
    // bomb: 47 (random)

    // ! Game Starts:
    // Please pick a number between 1 - 100
    // User: 4
    // Please pick a number between 4 - 100
    // User: 67
    // Please pick a number between 4 - 67
    // User: 47
    // Bomb!

    // While, Random, Scanner



    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1;
    int input= -1;
    Scanner scanner = new Scanner (System.in);
    while (bomb != input) {
      System.out.println("Please pick a number between " + min + "-" + max);
      input = scanner.nextInt();
      if (input < min || input > max)
      continue;
      // min, max
      if (input > bomb) {
        max = input;
      } else {
        min = input;
      }
    }
    System.out.println("Bomb!");
    scanner.close();

    }




      // check if duplicated exists
      public static boolean isDuplicated (int[] arr, int newValue) {
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == newValue)
          return true;
        }
        return false;
    }
  }



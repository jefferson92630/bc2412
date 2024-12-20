public class DemoForEachLoop {
  public static void main(String[] args) {
    // for loop, while loop, for-each loop
    int[] arr = new int[] {3, 4, 5};

    // Just get one value for each iteration
    for (int i = 0; i < arr.length; i++) { 
      System.out.println(arr[i]);
    }

    // 3 + 4
    // 4 + 5
    for (int i = 0; i < arr.length - 1; i++) { 
    System.out.println(arr[i] + arr[i + 1]);
        }


    // for-each
    for (int integer : arr) { // Just get one value for each iteration
      System.out.println(integer);
    }

    char[] arr2 = new char[] {'p', 't', 'e'};
    // for-each loop -> "pte"
    String str = "";
    for (char i : arr2) {
      str += i;
    }
    System.out.println(String.valueOf(str));

    String[] arr3 = new String[] {"abc", "ijk", "def"};
    String target = "ijk";
    // true
    boolean isTargetExist = false;
    for (String p : arr3) {
      if (target.equals(p)) {
        isTargetExist = true;
      }
      }
      System.out.println(isTargetExist);
    }
  }


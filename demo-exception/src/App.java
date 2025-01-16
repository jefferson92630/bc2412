public class App {
  public static void main(String[] args) {
    // Forsee -> Avoid
    int q = 0;
    if (q != 0) {
    int x = 10 / q;
    } else {
      System.out.println("q is zero");  
    }

    // For most case of exception that blocked by Java, we should use if.
    // Handle Exception, but should not use because it is inherited blocked by Java
    try {
    int a  = 10 / q; // Java by default throw exception for some scenario (i.e / 0)
    } catch (ArithmeticException e) {
    System.out.println("Cannot divided by zero");
    }

    // 2. Nullpointer Exception (NPE)
    String s = null; // if the input is not input by you, use try & catch
    // avoid
    if (s != null)
    System.out.println(s.charAt(0));
    // System.out.println(s.charAt(0)); 

    // try & catch, must use together
    String result = null;
    try {
      result = concat("hello", "abc"); // method caller
    } catch (IllegalArgumentException e) { 
      // 1. catch class
      // 2. when somethingn wrong happen within the try block 
      System.out.println("Ignore the bomb");
    }
    System.out.println(result);

    // 3. Integer.parseInt
    String input = "-3.";
    int x2 = 0;
    try {
     x2 = Integer.parseInt(input); // from String to int
    } catch (NumberFormatException e) {
     x2 = -1;
    }
    System.out.println(x2); // -1

    // 4. java.lang.ArrayIndexOutOfBoundException
    // Avoid, because the arr[3] must not input by user
    String[] arr = new String[] {"abc", "def", "ijk"};
    // System.out.println(arr[3]);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

    // 5. java.lang.StringIndexOutOfBoundsException
    String s3 = "hello";
   // System.out.println(s3.charAt(s3.length()));


  }
  // when this method is not made by you, use try & catch
    public static String concat(String x, String y) { // x can be null
      if (x == null)
        throw new IllegalArgumentException(); // Argument means parameter, complain method input parameters
        // throw an object
      return x.concat(y);
  }

}

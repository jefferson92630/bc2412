public class DemoSwitch {
  public static void main(String[] args) {
    int x = 4;
    if (x == 1) {
      System.out.println("x=1");
    } else if (x == 2) {
      System.out.println("x=2");
    } else if (x == 3) {
      System.out.println("x=3");
    } else {
      System.out.println("somethings else ..."); // print
    }

    // switch
    switch (x) { // checking x == only
      case 1:
      System.out.println("x=1");
      break;
      case 2:
      System.out.println("x=2");
      break;
      case 3:
      System.out.println("x=3");
      break;
      default:
      System.out.println("something else ...");
    }

    char gender = 'M'; // F , M (well defined value change)
    switch (gender) {
      case 'M':
      System.out.println("Male");
      break;
      case 'F':
      System.out.println("Female");
      break;
    }

  }
 }


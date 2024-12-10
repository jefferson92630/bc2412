public class Exercise20241210 {
  public static void main(String[] args) {
    double priceOfApple = 7.3;
    double priceOfOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    int totalqty = quantityOfApple + quantityOfOrange;
    System.out.println(totalqty); // 7

    double totalamount = quantityOfApple * priceOfApple + quantityOfOrange * priceOfOrange;
    System.out.println(totalamount); // 47.9


    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;

    double averageScore = (mathScore + englishScore + historyScore) / 3.0;
    System.out.println(averageScore); // 64.666667


    // byte, short, int, long
    // byte ->　short -> int -> long (grading)

    byte maxByte = 127;

    //int value -> byte
    maxByte = (byte) (maxByte - 2); // Java: is is safe? Not safe (not consider actual value, only consider whether int value can put into byte variable)
    // byte value + int value -> int value
    // can we assign int value to byte variable? (downcasting)

    System.out.println(maxByte); // 125, overflow

    int x = maxByte; // Java: is it safe? It is safe

    byte bb1 = 10;
    byte bb2 = 20;

    int x20 = bb1 + bb2;
    System.out.println(x20);



    // ! Java: (1) Compile time + (2) Run time
    // (1) java file (.java) -> class file (.class): java code -> byte code (~machine)
      //(1.1) compile fail. for example (missing ; -> syntax error)
      //(1.2) compile success -> class file
    // (2)Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine code 

  }
}

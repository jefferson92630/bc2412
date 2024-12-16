public class DemoString {
  public static void main(String [] args) {
    char x = 'a';
    x = 1; // ! ????
    // x = 1.1;
    // x = true;
    x = 'x';
    //char x = 'o';

    // ! define a String value by double quote
    // ! define a char value by single quote

    String password = "abcd1234"; // not primitive, it can carry tools, so 1st letter is capital letter
    String emailAddress = "abc@gmail.com";

    // + operation
    password = password + "!";
    System.out.println("helloworld");
    System.out.println(password); // abcd1234!

    // Java Method (instance method)
    // action/ tools

    char result = password.charAt(0); // 0 represent the first position of the string value, charAt is tools, must be char value
    System.out.println(result); // a

    // ! index starts from 0 to length-1, eg. 9 grids, length = 9, but max. index is 8
    System.out.println(password.charAt(4)); // 1
    // System.out.println(password.charAt(-1)); // error, complier not consider the memory, so the code still valid
    // System.out.println(password.charAt(9)); // error

    // Problem: print the last character of string.
    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length()-1);
    System.out.println(lastChar);

    // equals ()
    String s1 = "abc";
    String s2 = "abc";
    boolean result2 = s1.equals(s2);
    System.out.println(result2); // true

    // equals() -> false
    String s3 = "abc";
    String s4 = "def";
    boolean result3 = s3.equals(s4);
    System.out.println(result3); // false

    // length()
    int result4 = password.length();
    System.out.println(result4); // 9, the length of string value

    // Empty String
    String emptyString = "";
    System.out.println(emptyString.length());
    boolean isStringEmpty = emptyString.equals(""); // asking if emptystring equals ""
    System.out.println(isStringEmpty); // true

    String s = "hello";
    System.out.println("hello".equals(s)); // asking if s equals to "hello", cannot exchange position with each other
    System.out.println("hello".charAt(2)); // l
    System.out.println("hello".length()); // 5

    // 'c'. charAt() // Primitive has no method (tool)

    // isEmpty(), check whether the string is empty
    String s5 = "abc";
    // check if s5 is empty
    boolean isEmpty = s5.length() == 0;
    System.out.println(isEmpty); // false
    System.out.println(s5.isEmpty()); // false

    if (!s5. isEmpty()) {

    }

    // substring
    // abc
    String substr = s5.substring (0, 2);
    // ! s5 value does not change
    // ! substr is storing a new String value returned by "substring"
    System.out.println(s5); //abc
    System.out.println(substr); // ab
    System.out.println(s5.substring (0, 2)); // ab
    System.out.println(s5.substring (0, 3)); // abc
    System.out.println(s5.substring(0, s5.length())); // abc
    System.out.println(s5.substring(1)); // bc
  }

}
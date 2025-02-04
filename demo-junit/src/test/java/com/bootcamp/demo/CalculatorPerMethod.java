package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance (Lifecycle.PER_METHOD) // by default
// ! One Test Object to call all test cases
public class CalculatorPerMethod {
  // Test Object
  private int x; // test env variable

  @Test
  void testSum() {
    this.x += Calculator.sum2(1,2);
    assertEquals(3, this.x);
  }

  @Test
  void testSum2() {
    this.x += Calculator.sum2(1,2);
    assertEquals(3, this.x);
  }


  // ! "mvn test" perform something similar process as below
  public static void main(String[] args) {
    CalculatorPerClassTest testObject = new CalculatorPerClassTest();
    testObject.testSum();
    CalculatorPerClassTest testObject2 = new CalculatorPerClassTest();
    testObject2.testSum2();
  }
}


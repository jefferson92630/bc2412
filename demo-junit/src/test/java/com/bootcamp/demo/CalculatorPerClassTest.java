package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;

// ! One Test Object to call all test cases
@TestInstance (Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Calculator.java Tests")
public class CalculatorPerClassTest {
  // Test Object
  private int x; // test env variable

  @BeforeAll
  void initAll() {
    System.out.println("Before All Test Cases");
  }

  @AfterAll
  void afterAll() {
    System.out.println("After All Test Cases");
  }

  @BeforeEach
  void reset() {
    System.out.println("Before each test case, reset something ....");
  }

  @AfterEach
  void clear() {
    System.out.println("After each test case, clear something ....");
  }

  @Test
  @Order(1)
  void testSum() {
    System.out.println("Test Cases 1");
    this.x += Calculator.sum2(1,2);
    assertEquals(3, this.x);
  }

  @Test
  @Order(2)
  void testSum2() {
    System.out.println("Test Cases 2");
    this.x += Calculator.sum2(1,2);
    assertEquals(6, this.x);
  }

  // ! "mvn test" perform something similar process as below
  public static void main(String[] args) {
    CalculatorPerClassTest testObject = new CalculatorPerClassTest();
    testObject.testSum();
    testObject.testSum2();
  }

}

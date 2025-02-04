package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ! Test Java file name should be with "Test" or "Tests" suffix
public class StaffTest {
  @Test
  void testStaff_GetterSetter() {
    Staff s1 = new Staff();
    Assertions.assertEquals(0, s1.getAge());
    s1.setAge(18);
    Assertions.assertEquals(18, s1.getAge());
  }

  @Test
  void testStaff_Constructor() {
    Staff s2 = new Staff("Ben", 19);
    Assertions.assertEquals(19, s2.getAge());
    Assertions.assertEquals("Ben", s2.getName());
  }

  @Test
  void testStaffEqual() {
    Staff s1 = new Staff("Steven", 30);
    Staff s2 = new Staff("Steven", 30);
    Assertions.assertEquals(s1, s2);
  }

  @Test
  void testStaffToString() {
    Staff s1 = new Staff("Steven", 30);
    // Assertions.assertEquals("Staff(name=Steven, age=30)", s1.toString());
    Assertions.assertEquals("Steven 30", s1.toString());
  }
}

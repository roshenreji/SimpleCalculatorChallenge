package com.mindtree.SimpleCalculator;
//Arrange-Act-Assert pattern
import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;

public class CalculatorTest {
private Calculate objCalcUnderTest;

@Before
public void setUp() {
//Arrange
objCalcUnderTest = new Calculate();
}

@Test
public void testAdd() { 
int a = 15; int b = 20; 
int expectedResult = 35;
//Act 
long result = Calculate.add(a, b);
//Assert
Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
int a = 25; int b = 20; 
int expectedResult = 5; 
long result = Calculate.subtract(a, b);
Assert.assertEquals(expectedResult, result);
}

}
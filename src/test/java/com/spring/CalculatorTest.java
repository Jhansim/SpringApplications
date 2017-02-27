package com.spring;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private static ICalculator calc ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		calc = null;
	}

	@Before
	public void beforeTest() throws Exception {
		System.out.println("Test Start");
	}
	@After
	public void afterTest() throws Exception {
		System.out.println("Test End");
	}

	@Test
	public void testSum() {
		int sum = calc.sum(10,16);
		assertEquals(sum, 26);
		
	}

	@Test
	public void testSubtraction() {
		int sub = calc.subtraction(16,10);
		assertEquals(sub, 6);
	}

	@Test
	public void testMultiplication() {
		int mul = calc.multiplication(16,10);
		assertEquals(mul, 160);
	}

	@Test(expected=Exception.class)
	public void testDivison() throws Exception {
		int div = calc.divison(10, 0);
		fail("Not yet implemented");
	}
	@Ignore
	@Test
	public void testEqualIntegers() {
		
	}

}

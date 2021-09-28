package com.bridgelabz.GenricsDay13;

import org.junit.Assert;
import org.junit.Test;

public class testMaximum{
	@Test
	public void testInteger(){
		int actual=Maximum.getmaximum(499, 200, 340);
		Assert.assertEquals(499,actual ,0);
	}


	/**
		in this case the junit is sucess values is matched 
	 */
	//floating test case
	@Test
	public void float1() {
		float actualValue = Maximum.getmaximum1(12f,14f,15f);
		Assert.assertEquals(15,actualValue ,0);
	}

	@Test
	public void float2() {
		float actualValue = Maximum.getmaximum1(1000f,545f,746f);
		Assert.assertEquals(1000,actualValue, 0);
	}

	//maximum value of string
	@Test
	public void stringMax1() {
		String actualValue = Maximum.getmaximum2("Aa","Bb","Cc");
		Assert.assertEquals("Cc",actualValue);
	}

	@Test
	public void stringMax2() {
		String actualValue = Maximum.getmaximum2("abc","ABC","def");
		Assert.assertEquals("def", actualValue);
	}
	
	//more than three parameter
	@Test
	public void threeValuesWhenGetMaximumReturnCorrectValue1() {
		int actualResult = Maximum.testMaximum(12, 4, 6);
		Assert.assertEquals(12, actualResult);
	}
	@Test
	public void fiveValuesWhenGetMaximumReturnCorrectValue() {
		int actualResult = Maximum.testMaximum(360,480,720,1040,2080);
		Assert.assertEquals(2080, actualResult);
	}

	@Test
	public void floatGivenWhenGetMaximumReturnCorrectValue() {
		float actualResult = Maximum.testMaximum(15.8f, 16.7f, 16.0f);
		Assert.assertEquals(16.7f, actualResult ,0);
	}


	@Test
	public void fourfloatGivenWhenGetMaximumReturnCorrectValue() {
		float actualResult = Maximum.testMaximum(34.0f, 520.0f, 68.0f, 10.20f,30.80f);
		Assert.assertEquals(520.0f, actualResult,0);
	}
	@Test
	public void strinGivenMaximumReturnValue() {
		String actualResult = Maximum.testMaximum("srikanth", "reddy", "yaddala");
		Assert.assertEquals("yaddala", actualResult);
	}

	@Test
	public void fourStrinGivenMaximumReturnValue() {
		String actualResult = Maximum.testMaximum("srikanth", "reddy", "yaddala", "cricket","dgfdg");
		Assert.assertEquals("yaddala", actualResult);
	}
	//using genrics merge all into one
	@Test
	public void intMax() {
		int actualValue = Maximum.testMaximum(30, 550, 5);
		Assert.assertEquals(550, actualValue);
	}

	@Test
	public void floatMax() {
		float actualValue = Maximum.testMaximum(9f,42f,16f);
		Assert.assertEquals(42f,actualValue,0);
	}
	@Test
	public void stringMax() {
		String actualValue = Maximum.testMaximum("srikanth","reddy","yaddala");
		Assert.assertEquals("yaddala",actualValue);
	}
}
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
	//using genrics merge all into one
	@Test
	public void intMax() {
		int actualValue = Maximum.testMaximum(10, 20, 5);
		Assert.assertEquals(20, actualValue);
	}

	@Test
	public void floatMax() {
		float actualValue = Maximum.testMaximum(11f,52f,36f);
		Assert.assertEquals(52f,actualValue,0);
	}
	@Test
	public void stringMax() {
		String actualValue = Maximum.testMaximum("ABC","def","xyz");
		Assert.assertEquals("xyz",actualValue);
	}
}
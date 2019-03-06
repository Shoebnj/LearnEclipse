package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void sum() {
		System.out.println("Sum");
		int a=20;
		int b=30;
		Assert.assertEquals(50, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("Substraction");
		int a=20;
		int b=30;
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void div() {
		System.out.println("Div");
		int a=20;
		int b=60;
		Assert.assertEquals(3, b/a);
	}
	@Test
	public void Multi() {
		System.out.println("Multi");
		int a=20;
		int b=30;
		Assert.assertEquals(600, a*b);
	}
	
	
	
	
	
	
}

package com.test;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class demo_asssertion {
  @Test
  public void testmethod1() {
	  Assert.assertTrue(20>18);
  }
  @Test
  public void testmethod2() {
	  Assert.assertTrue("sushant".equals("hello"));
  }
  @Test
  public void testmethod3() {
	  Assert.assertFalse(20>18);
  }
  @Test
  public void testmethod4() {
	  Assert.assertFalse("sushant".equals("hello"));
  }
  @Test
  public void testmethod5() {
	  Assert.assertEquals(200,300);
  }
  @Test
  public void testmethod6() {
	  Assert.assertEquals("hello sushant kumar".contains("sushant"),true);
  }
  @Test
  public void testmethod7() {
	  Assert.assertNotEquals("hello sushant kumar".contains("world"),true);
  }
  @Test
  public void testmethod8() {
	  Object obj1=null;
	  Assert.assertNull(obj1);
  }
  @Test
  public void testmethod9() {
	  Object obj2=null;
	  Assert.assertNotNull(obj2);
  }
  @Test
  public void testmethod10() {
	  Object obj1=new Object();
	  Object obj2=obj1;
	  Assert.assertSame(obj1,obj2);//Assert.assertNotSame()
  }
  @Test
  public void testmethod11() {
	  Assert.fail("Intentionally fail");
  }
  @Test
  public void testmethod12() {
	  System.out.println("First validation");
	  Assert.assertEquals(200,200);
	  
	  System.out.println("Second validation");
	  Assert.assertEquals(200,200);
  }
  @Test
  public void testmethod13() {
	  SoftAssert sa=new SoftAssert();
	  System.out.println("First validation");
	  sa.assertEquals(200,100);
	  
	  System.out.println("Second validation");
	  sa.assertEquals(200,200);
	  
	  System.out.println("First validation");
	  sa.assertEquals(50,100);
	  sa.assertAll();
	  
  }
}

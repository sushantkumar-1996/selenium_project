package com.test;

import org.testng.annotations.Test;

public class demo4_testng_priority {
  @Test(priority=3)
  public void C() {
	  System.out.println("C");
  }
  @Test(priority=4)
  public void D() {
	  System.out.println("D");
  }
  @Test(priority=2)
  public void B() {
	  System.out.println("B");
  }
  @Test(priority=1)
  public void a() {
	  System.out.println("A");
  }
}

package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class demo5_dataprovider {
  @Test(dataProvider = "getdata")
  public void setData(String username, String password) {
	  
	  System.out.println("username:"+username+"\t\tpassword:"+password);
  }

  @DataProvider
  public Object[][] getdata() {
     Object[][]data= {
       { "sushant", "Kumar" },
       { "hello", "world" },
       {"sk","world"}
    };
    return data;
  };
}

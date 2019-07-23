package com.test;
import java.util.*;
public class demo1_java {

	public static void main(String[] args) {
		int a,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		while(a>0)
		{
			i=a%10;
			System.out.print(i);
			a=a/10;
		}
	}

}

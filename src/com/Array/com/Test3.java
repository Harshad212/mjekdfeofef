package com.Array.com;
import java.util.Scanner;
public class Test3 {
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter size of an array");
	int  size=sc.nextInt();
	String arr[]=new String [size];
	
	System.out.println("Enter Your firstname :");
	String name = sc.next();
	System.out.println("Enter your village");
	String village=sc.next();
	System.out.println("enter your surname");
	String surname=sc.next();

	arr[0]=name;
	arr[1]=village;
	arr[2]=surname;
	
	
	for(String m:arr) {
		System.out.println(m);
	}
	
	}

}

package com.Array.com;
import java.util.*;
public class NopresentorNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]= {5,7,1,4,6,10,13};
		System.out.println("Enter your number");
		boolean flag=false;
		int num=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
	}

}



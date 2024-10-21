package com.Array.com;
import java.util.Scanner;
public class Test4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array");
int size=sc.nextInt();
int arr[]=new int [size];

System.out.println("Enter the elements");
for(int i=0;i<arr.length;i++) {
	
	arr[i]=sc.nextInt();
}
	System.out.println("enter no of obeservation");
	int n=sc.nextInt();
	int sum=0;
	int avg=0;
	for(int m:arr) {
		sum=sum+m;
		avg=sum/n;
		
	}
	
	System.out.println(sum);
	System.out.println(avg);
}
}

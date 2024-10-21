package com.Array.com;

public class Test5 {
	public static void main(String[] args) {
		int arr[]= {1,4,5,2,3};
		System.out.println("ORIGINAL ARRAY");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("REVERSE ARRAY");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}	}

}

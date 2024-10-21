package com.Array.com;

public class MaxandMin {
	public static void main(String[] args) {
		int a[]= {10,40,23,56,11,16,68,72,54};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				
				max=a[i];
			}else if(a[i]<min) {
				min=a[i];
				
			}
			
		}
		System.out.println("max element is "+max);
		System.out.println("min element is "+min);
	}

}

package com.Array.com;

public class ArrayAscendingorder {
	public static void main(String[] args) {
		int a[]= {5,8,1,4,3};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
						
		}
		System.out.println("Ascending order is ");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(+a[i]+" ");
		}
	}

}

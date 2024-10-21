package com.Array.com;

public class Student {
	
	private String name;
	private double marks;
	private int rollnum;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public int getRollnum() {
		return rollnum;
	}


	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}


	public static void main(String[] args) {
		/*
		 * Student arr[]=new Student[3]; arr[0]=new Student(); arr[1]=new Student();
		 * arr[2]=new Student();
		 */
		//0R
		
		Student[]arr= {new Student(),new Student(),new Student()};
		
		arr[1].setName("JAY");
		arr[1].setMarks(13.32);
		arr[1].setRollnum(44);
		arr[0].setName("Harsh");
		arr[0].setMarks(23.11);
		arr[0].setRollnum(23);
		arr[2].setName("suraj");
		arr[2].setMarks(98.34);
		arr[2].setRollnum(54);
		
		for(Student h:arr) {
			System.out.println(h.getName());
			System.out.println(h.getMarks());
			System.out.println(h.getRollnum());
			System.out.println("-------------------");
		}
		
//		arr[0].setName("jay");
//		arr[1].setMarks(99.24);
//		arr[2].setRollnum(11);
		
		
		
		
	}

}

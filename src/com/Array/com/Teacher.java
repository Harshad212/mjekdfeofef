package com.Array.com;

public class Teacher {
	private String teachername;
	private int rollno;
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public static void main(String[] args) {
		
		Teacher arr[]=new Teacher[2];
		
		arr[0]=new Teacher();
		arr[1]=new Teacher();
		
		
		arr[0].setTeachername("sujina mam");
		arr[0].setRollno(23);
		arr[1].setTeachername("santosh sir");
		arr[1].setRollno(33);
		
		for(Teacher t:arr) {
			System.out.println(t.getRollno());
			System.out.println(t.getTeachername());
			
		}
		
	}
	
}

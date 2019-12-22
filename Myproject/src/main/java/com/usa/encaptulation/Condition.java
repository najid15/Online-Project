package com.usa.encaptulation;

public class Condition {
	
	
	
	public static void main(String[] args) {
		
		String x="hasan";
		String y="shahin";
		String z="hasan";
		
		if (x==y) {
			System.out.println("name is correct");
			
		}
		else if(z==x) {
			System.out.println("My name is Nice");
			
		}
		
		else {
			System.out.println("Name is correct");
		}
		int x = 20; // String name = "Smart-teach";
		int y = 15; // String Address = "Jackson-Height";
		int z = x+y; //String result = name + Address;
	                 //System'out'println(My school name is a : "+ " & my address is a : "+ result);
		
		System.out.println(z);
		
		if (x < y) {
			System.out.println("x is a greater than y");
			
		}
		else if (y < x) {
			System.out.println("y is greater than x");
		}
		else
			System.out.println("it is wrong");
	}

}

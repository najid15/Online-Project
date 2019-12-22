package com.usa.encaptulation;

import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c = 40;
		int d = 50;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//This is single dimantion 1st way
		int[] test  = new int [4];
		test[0] = 10;
		test[1] = 20;
		test[2] = 30;
		test[3] = 40;
		System.out.println(Arrays.toString(test));
		System.out.println(test[1]);
		
		//This is single damnation 2nd way
		int [] num = {10, 20, 30, 40};
		System.out.println(Arrays.toString(num));
		
		//This is multi damntion
		int []  [] number = {{10,20,30,40},
		                    {50,60,70,80},
		                    {90,100,110,120}};
		
		System.out.println(number[2][1]);
		              
		
		String [] name = {"Selenium","Java","Ruby","Python","PHP"};
		//System.out.println(Arrays.deepToString(name));
		for (int i =0; i<name.length; i ++) {
			System.out.println(name[i]);
		}
		
		for(String obj : name) {
			System.out.println(obj);
		}
		}
		
	}




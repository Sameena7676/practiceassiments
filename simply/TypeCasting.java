package com.simply;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("implicit type casting");
		char a='A';
		System.out.println("value of a "+a);
		int b=a;
		System.out.println("value of int"+b);
		 
		float c=b;
		System.out.println("value of float"+c);
		
		long d=b;
		System.out.println("value of long "+d);
		double e=b;
		System.out.println("value of double "+e);
		
		System.out.println("explicit typecasting");
		double x=89.99;
		int y=(int)x;
		System.out.println("value of x is "+x);
		System.out.println("value of  y is "+y);
	}

}

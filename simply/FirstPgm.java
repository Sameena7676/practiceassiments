package com.simply;

import java.util.Scanner;

public class FirstPgm {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scanner.nextInt();
		System.out.println("enter the secand number");
		int num2=scanner.nextInt();
		 
		if(num1>num2)
		{
			System.out.println(num1+"is larger");
			
		}
		else
		{
			System.out.println(num2 +"is larger");
			
		}
		
	}
 
}

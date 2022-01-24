package com.simply;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) 
	{
		int number, i;
Scanner	scanner	  = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = scanner.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			System.out.print(i +"\n"); 
		}	

	}
	}

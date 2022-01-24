package com.simply;

import java.util.Scanner;

public class DivisibaleBy5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		if(num%5==0)
		{
			System.out.println("given number is divisibal by 5");
		}
		else
			{
			     System.out.println("given number is not divisibal by 5");
			     
				
			}
	}

}

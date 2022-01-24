package com.simply;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
			System.out.println("enter number");
			int num1=scanner.nextInt();
			if (num1%2==0)
			{
				System.out.println(num1 +" is a  even number");
				
			}
			else
			{
				System.out.println(num1 +"is a odd number"); 
			}
	
	}

}

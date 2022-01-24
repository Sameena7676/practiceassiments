package com.simply;

import java.util.Scanner;

public class AgeVote {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter age");
		int num=scanner.nextInt();
		if (num>18)
		{
			System.out.println("age is above 18 eligibal for vote");
			
		}
		else{
			System.out.println("not eligibal for vote");
		}
		
	}
	

}

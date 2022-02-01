package exceptionhandling;

import java.util.Scanner;

public class ThrowDemo {
	Scanner sc=new Scanner(System.in);

	void check(int age)
	{
		if(age<18)
			throw new ArithmeticException("Age is not valid for vote");
		else
			System.out.println("Valid");
	}
	
	public static void main(String[] args) {
		ThrowDemo t=new ThrowDemo();
		//handle exception try catch
		
		try {
			t.check(8);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}

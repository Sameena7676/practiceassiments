package com.simply;

import java.util.Scanner;

public class OddNum {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = scanner.nextInt();
        int i;
 
 System.out.println("First "+n+" ODD nos");
 
 for(i=1;i<=2*n;i++)
 {
 if(i%2 == 0)
 continue;
 else
 System.out.println(i);
 }  
    }


}

package com.Fixbug.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class FixBug {

	private static final String Collection = null;
	public static void main(String[] args) {
		System.out.println("\n***********\n");
		System.out.println("\n welcome to desk\n");
		System.out.println("\n***********\n");
		optionsSelection();
	}

	private static void optionsSelection() {
		// TODO Auto-generated method stub 
		String[] arr={"1.I want to review my expenditure\n",
				"2. I want  to add my expenditure\n",
				" 3. i want to delete my expenditure \n",
				"4. i want to sort the expenditures \n",
				"5 i want to search for a particular expendituren\n",
				"6. close the application"
		};
		int[] arr1 ={1,2,3,4,5,6};
		int slen = arr.length;
		for (int i=0; i<slen;i++){
			System.out.println(arr[i]);
		}
		ArrayList<Integer> arraylist= new ArrayList<Integer>();
		ArrayList<Integer> expenses =new ArrayList<Integer>();
		expenses.add(1000);
		expenses.add(2300);
		expenses.add(45000);
		expenses.add(32000);
		expenses.add(110);
		System.out.println("\n enter your choice :\t");
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();
		
		for (int j=1;j<=slen;j++)
		{
			if(options == j){
				switch (options){
				case 1:
					System.out.println("you seved expeness are listed below:\n");
					System.out.println(expenses+"\n");
					optionsSelection();
					break;
				case 2:
					System.out.println("Enter the value to add yours expense:\n");
					
					int value =sc.nextInt();
					expenses.add(value);
					System.out.println("your value is updated \n");
					expenses.addAll(arraylist);
					System.out.println(expenses+"\n");
					optionsSelection();
					break;
				case 3:
					System.out.println("you are about the delete all your expences !\n condim again by select the some option...\n");
					int  con = sc.nextInt();
					if(con  == options){
						expenses.clear();
						System.out.println(expenses+"\n");
						System.out.println("all yours expenses are erased!\n");
					}
					else{
						System.out.println("oops... try again!");
						}
					optionsSelection();
					break;
				case 4:
					sortExpenses(expenses);
					optionsSelection();
					break;
				case 5:
					searchExpenses(expenses);
					optionsSelection();
					break;
				case 6:
					closeApp();
					break;
					default:
						System.out.println("you have made ab invalid choice!");
						break;
					
				}
				}
			}
		}
	private static  void closeApp(){
		System.out.println("Close your application ...\n thank you !");
	}
	private static void searchExpenses(ArrayList<Integer> arrayList){
		int leng = arrayList.size();
		System.out.println("Enter the expense you need to search:\n");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<leng;i++){
			if (arrayList.get(i)== i){
				System.out.println("Found the expense"+ i +"at"+i+"posithion");
				
			}
		}
	}
	private static void sortExpenses(ArrayList<Integer> arrayList){
		int arraylength= arrayList.size();
		
		//Collection.sort(arrayList<Integer>);
		System.out.println("Sorted expenses:");
		for(Integer i:arrayList){
			System.out.println(i+" ");
		}
		System.out.println("\n");
		}
		
		
	}
		
	



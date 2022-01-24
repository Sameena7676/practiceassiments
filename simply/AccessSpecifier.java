package com.simply;

public class AccessSpecifier {
	protected void display()
	{
		System.out.println("you are accessing protected method of the class");
		
	}
	private void test()
	{
		System.out.println("my private method");
		
	}
	public void hello()
	{
		System.out.println("public method ");
		
	}
	void world()
	{
		System.out.println("defalt method ");
	}
	public static void main(String[] args) {
		AccessSpecifier obj=new
				AccessSpecifier();
		obj.display();
		obj.test();
		obj.hello();
		obj.world();
		
		
				
	}    
	}

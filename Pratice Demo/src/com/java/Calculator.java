package com.java;

public class Calculator
{
	int num1;
	int num2;
	int resultl;

	public void add(int n1,int n2)
	{
		int num1;
		int num2;
		int result=n1+n2;
		System.out.println("Addition is "+result);
	}
	
	public void sub(int n1,int n2)
	{
		int num1;
		int num2;
		int result=n1-n2;
		System.out.println("Substraction is "+result);
	}
	
	public void multiply(int n1,int n2)
	{ 
		int num1;
		int num2;
		int result=n1*n2;
		System.out.println("Multiplication is "+result);
	}
	 
	public void divide(int n1, int n2)
	{
		int num1;
		int num2;
		float result=n1/n2;
		System.out.println("Division is "+result);
	}
	
	
	public static void main(String[] args) 
	{
      Calculator c= new Calculator();
     c.add(10, 15);
     c.sub(15, 4);
     c.multiply(5, 10);
     c.divide(45, 5);
     
	}

}

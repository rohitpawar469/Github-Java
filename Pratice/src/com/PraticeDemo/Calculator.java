package com.PraticeDemo;

public class Calculator 
{
	int num1;
	int num2;
	int result;
   public void add(int n1,int n2)
   {
	    num1=n1;
	    num2=n2;
	    result=n1+n2;
	    System.out.println("Addition: "+result);
   }
   public void sub(int n1,int n2)
   {
	   num1=n1;
	   num2=n2;
	   result=n1-n2;
	   System.out.println("Substraction: "+result);
   }
   public void mul(int n1,int n2)
   {
	   num1=n1;
	   num2=n2;
	   result=n1*n2;
	   System.out.println("Multiplication: "+result);
   }
   public void div(int n1,int n2)
   {
	   num1=n1;
	   num2=n2;
	   result=n1/n2;
	   System.out.println("Division: "+result);
	   
   }
   public void square(int n1)
   {
	   num1=n1;
	   
	   result=n1*n1;
	   
	   System.out.println("Square: "+result);
   }
	public static void main(String[] args)
	{
       
       Calculator c=new Calculator();
       c.add(20, 30);
       c.sub(500, 87);
       c.mul(20, 24);
       c.div(500, 25);
       c.square(25);
	}

}

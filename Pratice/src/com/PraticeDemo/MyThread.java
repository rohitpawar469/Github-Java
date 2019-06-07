package com.PraticeDemo;

public class MyThread extends Thread
{
   public void run()
   {
	  System.out.println("No-args method"); 
   }
    
   public void run(int i)
   {
	   System.out.println("int-args method");
   }
   
	public static void main(String[] args)
	{
	MyThread t1=new MyThread();
	t1.start();

	}

}

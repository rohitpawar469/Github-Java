package com.PraticeDemo;

public class ThreadDemo1 extends Thread
{
   public void run()
   {
	   for(int i=0;i<10;i++)
	   {
		   System.out.println("Child Thread");
	   }
	   
   }
	public static void main(String[] args)
{

		ThreadDemo1 t2=new ThreadDemo1();
		t2.setPriority(6);
		 t2.start();
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Main Thread");
		 }
		
	}

}

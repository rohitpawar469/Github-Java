package com.PraticeDemo;

public class ThreadDemo extends Thread 
{

	public static void main(String[] args) 
	{
       System.out.println(Thread.currentThread().getName());
       ThreadDemo t1=new ThreadDemo();
       System.out.println(t1.getName());
       Thread.currentThread().setName("Rohit");
       System.out.println(Thread.currentThread().getName());
       System.out.println("The Main Thread Executed by: "+Thread.currentThread().getName());
       System.out.println("Child Thread Executed by: "+t1.getName());
       System.out.println("Thread priotity of Main Thread "+Thread.currentThread().getPriority());
       System.out.println("Child Thread Priority: "+t1.getPriority());
       Thread.currentThread().setPriority(8);
       System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
	}

}

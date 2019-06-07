package com.PraticeDemo;
 import java.io.*;
 
 class Account implements Serializable
 {
	 transient int i=10;
	 transient int j=20;
	 
 }
public class SerializationDemo 
{

	public static void main(String[] args) throws Exception
	{
         Account a1= new Account();
         FileOutputStream fos =new FileOutputStream("abc.ser");
         ObjectOutputStream oos=new ObjectOutputStream(fos);
        	oos.writeObject(a1);
        	System.out.println("Seralization Started");
        	System.out.println(a1.i+"...."+a1.j);

        	
        	System.out.println("Deserialization Stated");
        	FileInputStream fis=new FileInputStream("abc.ser");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Account a2=(Account)ois.readObject();
            System.out.println(a2.i+"......"+a2.j);
 	}

}


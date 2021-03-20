package pack2;
//import pack2.AccessModifier;

//Problem Statement: Take input in string, check implicit and explicit conversion on it
//import java.lang.*;
import java.io.*;

public class TypeCasting {
	public static void main(String args[]) throws IOException
	{
		//AccessModifier am = new AccessModifier();
		specificModifier sm = new specificModifier();
		sm .display();
		char a = 'a';
		//Implicit conversion
		System.out.println("This is implicit conversion");
		System.out.println("Value of a is "+a);
		int b=a; //char to integer
		System.out.println("Value of a in int is "+b);
		float c=a;//char to float
		System.out.println("Value of a in float is "+c);
		double d=a;//char to double
		System.out.println("Value of a in double is "+d);
		
		//Explicit conversion
		System.out.println("This is explicit conversion");
		double e = 50.5;
		int y = (int) e;//type casting as narrowing down is done here
		System.out.println("Value of e is "+e);
		System.out.println("Value of y is "+y);
		String a1 = "abc";
		System.out.println("Value of a1 is "+a1);
		int b1=Integer.parseInt(a1); //char to integer
		System.out.println("Value of a1 in int is "+b1);
		float c1=a;//char to float
		System.out.println("Value of a1 in float is "+c1);
		double d1=a;//char to double
		System.out.println("Value of a1 in double is "+d1);
		
	}
	
}

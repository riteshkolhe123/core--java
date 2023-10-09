package Algebra;

public class Calculator {
	public static void main(String args[])
	{
		int a= Addition(23,87);
		System.out.println(" Sum is "+a);
		
		int b= Subtraction(6897,9876);
		System.out.println(" Subtraction is "+b);
		
		int c= Multiplication(934,5674);
		System.out.println(" Product is "+c);
		
		int h= Division(81,9);
		System.out.println(" Division is "+h);
		
	}
	public static int Addition(int a,int b)
	{
		return a+b;
	}
	public static int Subtraction(int z,int x)
	{
		return z-x;
	}
	public static int Multiplication(int f, int g)
	{
		return f*g;
	}
	public static int Division(int l,int k)
	{
		return l/k;
	}

}

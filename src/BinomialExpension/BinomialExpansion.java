package BinomialExpension;

public class BinomialExpansion {
	public static void main(String args[])
	{
		int a= linearequation(50,150);
		System.out.println(a);
		
		int b= quadraticequation(2,3);
		System.out.println(b);
		
		int c= cubicequation(9,7);
		System.out.println(c);
		
		int d= quarticequation(3,5);
		System.out.println(d);
		
		int e= quinticequation(5,4);
		System.out.println(e);
	}
	public static int linearequation(int a,int s)
	{
		return a+s;
	}
	public static int quadraticequation(int a, int b)
	{
		return a*a + 2*a*b + b*b;
	}
	public static int cubicequation(int a,int b)
	{
		return a*a*a + 3*a*a*b + b*b*b;
	}
	public static int quarticequation(int a,int b)
	{
		return a*a*a*a + 4*a*a*a*b + 6*a*a*b*b + 4*a*b*b*b + b*b*b*b;
	}
	public static int quinticequation(int a,int b)
	{
		return a*a*a*a*a + 5*a*a*a*a*b + 10*a*a*a*b*b + 10*a*a*b*b*b + 5*a*b*b*b*b + b*b*b*b*b;
	}

}

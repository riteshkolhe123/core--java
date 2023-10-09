package InterestCalculator;
import java.util.Scanner;

public class InterestCalculator {
	public static void main(String args[])
	{
		System.out.println(" Welcome to Interest Calculator ");
		Scanner a= new Scanner(System.in);
	    System.out.println("Principle Amount is: " );
	    int Principleamount= a.nextInt();
	    System.out.println("Interest rate is: ");
	    float interestrate= a.nextFloat();
	    System.out.println("Time required: ");
	    float time= a.nextFloat();
	    float Interest= Principleamount * interestrate *  time ;
	    System.out.println("Interest is: "+ Interest);
	}

}

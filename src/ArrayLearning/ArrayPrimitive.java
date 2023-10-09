package ArrayLearning;

public class ArrayPrimitive {
	public static void main(String Args[])
	{
		int[] RollNumber = new int[10];
		for(int i=0;i<10;i++)
		{
			RollNumber[i] = i+10;
		}
		String[] names = new String[10];
		names[0] = "Ritesh";
		names[1] = "Saurabh";
		names[2] = "Shambhu";
		names[3] = "Sanket";
		names[4] = "Priti";
		names[5] = "Rohit";
		names[6] = "Chintu";
		names[7] = "Esha";
		names[8] = "Shruti";
		names[9] = "Sanika";
		
		String[] address = new String[10];
		address[0] = "Beed";
		address[1] = "Dharur";
		address[2] = "Kalamb";
		address[3] = "Nagar";
		address[4] = "Satara";
		address[5] = "Latur";
		address[6] = "Mumbai";
		address[7] = "Kaij";
		address[8] = "Baramati";
		address[9] = "Pune";
		
		for(int i=0;i<10;i++)
		{
			System.out.println("   Roll Number is: "+RollNumber[i]+" "+ "   Name is: "+names[i]+"   Address is: "+address[i]);
		}
		
	}

}

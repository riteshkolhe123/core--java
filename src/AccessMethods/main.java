package AccessMethods;

import JungleBook.Bear;
import JungleBook.Tiger;

public class main {
	public static void main(String args[])
	{
		tiger rk= new tiger();
		rk.name="Sher Khan";
		rk.drink();
		rk.roar();
		rk.sleep();
		rk.hunt();
		
		bear z= new bear();
		z.name="Baloo";
		z.drink();
		z.hunt();
		z.sleep();
	}

}

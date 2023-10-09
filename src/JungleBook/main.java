package JungleBook;

public class main {
	public static void main(String args[])
	{
		Tiger rk= new Tiger();
		rk.name="Sher Khan";
		rk.drink();
		rk.roar();
		rk.sleep();
		rk.hunt();
		
		Snake a= new Snake();
		a.name="koo";
		a.run();
		a.sleep();
		a.bite();
		
		Leopard q= new Leopard();
		q.name="Bagherra";
		q.sleep();
		q.drink();
		q.hunt();
		
		Bear z= new Bear();
		z.name="Baloo";
		z.drink();
		z.hunt();
		z.sleep();
		
		Human h=new Human();
		h.name="Mogli";
		h.think();
		h.drink();
		h.sleep();
		h.walk();
	}

}

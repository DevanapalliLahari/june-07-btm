class Cake{
	String name="cup cake";
	int price=500;
	String flavour;
	char initial;
	Cake()
	{
		System.out.println("The cake shop is running");
	}
}
class CakeRunner{
	public static void main(String[]args)
	{
		Cake cake=new Cake();
		System.out.println(" The cake is very  tall");
		Cake  weight=new Cake();
		System.out.println(cake.name);
		System.out.println(cake.price);
		System.out.println(cake.flavour);
		System.out.println(cake.initial);
	}
}
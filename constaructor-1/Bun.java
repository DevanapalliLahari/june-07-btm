class Bun{
	String type="Bread";
	boolean ingridients=false;
	float weight;
	double fat;
	Bun()
	{
		System.out.println("The bun is in round shape");
	}
}
class BunRunner{
	public static void main(String[]Args)
	{
		System.out.println("the main is running");
		Bun bun=new Bun();
		System.out.println(bun.type);
		System.out.println(bun.ingridients);
		System.out.println(bun.weight);
		System.out.println(bun.fat);
	}
}
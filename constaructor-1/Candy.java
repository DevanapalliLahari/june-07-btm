class Candy{
	String name="Cotton Candy";
	int noOfChocalate= 50;
	boolean flavour;
	float fat;
	Candy()
	{
		System.out.println("The candy is sweet");
	}
}
class CandyRunner{
	public static void main(String[]args)
	{
		Candy candy=new Candy();
		System.out.println("the main is running");
		System.out.println(candy.name);
		System.out.println(candy.noOfChocalate);
		System.out.println(candy.flavour);
		System.out.println(candy.fat);
	}
}
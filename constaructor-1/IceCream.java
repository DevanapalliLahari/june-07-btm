class IceCream{
	String name="cone";
	int price=40;
	String flavour;
	double weight;
	IceCream()
	{
		System.out.println("The icecream is very sweet");
	}
}
class IceCreamRunner
{
	public static void main(String[]args)
	{
		System.out.println("the main method is running");
	    IceCream iceCream=new IceCream();
		System.out.println(iceCream.name);
		System.out.println(iceCream.price);
		System.out.println(iceCream.flavour);
		System.out.println(iceCream.weight);
	}
}
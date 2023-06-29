class VegPuff{
	String place;
	int noOfIncredients=9;
	float weight=200.00f;
	String spices;
	VegPuff()
	{
		System.out.println("The puff is delicious");
	}
}
class VegPuffRunner{
	public static void main(String[]args)
	{
		VegPuff vegPuff=new VegPuff();
		System.out.println("The main method is running");
		System.out.println(vegPuff.noOfIncredients);
		System.out.println(vegPuff.place);
		System.out.println(vegPuff.weight);
		System.out.print(vegPuff.spices);
	}
}
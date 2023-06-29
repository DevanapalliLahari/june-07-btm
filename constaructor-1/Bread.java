class Bread{
	boolean vitamins=true;
	float iron=19f;
	String shape;
	double weight;
	Bread()
	{
		System.out.println("The is healthy food");
	}
}
class BreadRunner{
	public static void main(String[]args)
	{
		Bread bread=new Bread();
		System.out.println("the main is running");
		System.out.println(bread.vitamins);
		System.out.println(bread.iron);
		System.out.println(bread.shape);
		System.out.println(bread.weight);
	}
}
class Chocalate{
	String name="DairyMilk";
	int price=100;
	double weight;
	boolean type;
	Chocalate()
	{
		System.out.println("The chocalate is delicious");
	}
}
class ChocalateRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is running");
	    Chocalate chocalate=new Chocalate();
		System.out.println(chocalate.name);
		System.out.println(chocalate.price);
		System.out.println(chocalate.weight);
		System.out.println(chocalate.type);
	}
}
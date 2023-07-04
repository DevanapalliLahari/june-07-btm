class Kebab
{
	String name="fish";
	double price=900;
	String hotelName="sevsn hills";
	int noOfPieces=15;
	boolean takeAway=true;
	Kebab()
	{
		System.out.println("Running Kabab");
	}
	Kebab(String name)
	{
		System.out.println("the kebab name:"+name);
		this.name=name;
	}
	Kebab(double price)
	{
		System.out.println("Running double const in Kabab "+price);
		this.price=price;
	}
	Kebab(String hotelName,int noOfPieces)
	{
		System.out.println("Runnning String,int Const in Kabab");
		this.hotelName=hotelName;
		this.noOfPieces=noOfPieces;
	}
	Kebab(boolean takeAway)
	{
		System.out.println("Running boolean Const in Kabab "+takeAway);
		this.takeAway=takeAway;
	}
}
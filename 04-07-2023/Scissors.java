class Scissors
{
	String brand="DMI";
	String color="yeellow";
	String type="barer";
	String usage="Cutting";
	char size=4;
	double price=78;
	String material="iron";
	
	Scissors()
	{
		System.out.println("scissors is running");
	}
	Scissors(String brand)
	{
		System.out.println("the scissors brand:"+brand);
		this.brand=brand;
	}
	Scissors(char size)
	{
		System.out.println("the size is:"+size);
		this.size=size;
	}
	Scissors(double price)
	{
		System.out.println("the price is:"+price);
		this.price=price;
	}
	Scissors(String color,char size)
	{
		System.out.println("Running string");
		this.color=color;
		this.size=size;
	}
	Scissors(String type,double price)
	{
		System.out.println("Running string,double ");
		this.type=type;
		this.price=price;
	}
	Scissors(String usage,String color,double price)
	{
		System.out.println("Running String,String,double");
		this.usage=usage;
		this.price=price;
		this.color=color;
	}
}
	
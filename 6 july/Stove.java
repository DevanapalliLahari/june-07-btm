class Stove
{
	int price;
	double width;
	double length;
	double weight;
	String fuelType;
	int noOfBurners;
	int capacity;
	boolean electricStove;
	
	Stove(int price,double width,double length,double weight,String fuelType,int noOfBurners,int capacity,boolean electricStove)
	{
		System.out.println("Running int,double,double,double,String,int,int,boolean in Stove");
		this.price=price;
		this.width=width;
		this.weight=weight;
		this.length=length;
		this.fuelType=fuelType;
		this.noOfBurners=noOfBurners;
		this.capacity=capacity;
		this.electricStove=electricStove;
	}
}
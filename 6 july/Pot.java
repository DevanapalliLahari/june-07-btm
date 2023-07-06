class Pot{
	int price;
	int capacity;
	String colour;
	String requirements;
	double weight;
	String clayType;
	boolean hardness;
	int boilingPoint;
	Pot(int price,int capacity,String colour,String requirements,double weight,String clayType,boolean hardness,int boilingPoint)
	{
		System.out.println("Running int,int,String,String,double,String,boolen,int in pot");
		this.price=price;
		this.capacity=capacity;
		this.colour=colour;
		this.requirements=requirements;
		this.weight=weight;
		this.clayType=clayType;
		this.hardness=hardness;
		this.boilingPoint=boilingPoint;
	}
}
	
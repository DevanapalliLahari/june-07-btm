class Sofa{
	String brand;
	int cost;
	double height;
	double weight;
	String type;
	boolean comfortable;
	int durability;
	int capacity;
	Sofa(String brand,int cost,double height,double weight,String type,boolean comfortable,int durability,int capacity)
	{
		System.out.println("running String,int,double,double,String,booean,String,int in sofa");
		this.brand=brand;
		this.cost=cost;
		this.height=height;
		this.weight=weight;
		this.type=type;
		this.comfortable=comfortable;
		this.durability=durability;
		this.capacity=capacity;
	}
}
class Plate
{
    String brand;
	int price;
	String color;
	String type;
	String shape;
	boolean spikyPlate;
	double weight;
	int capacity;
	
	
	
	Plate(String brand,int price,String color,String plateType,String shape,boolean spikyPlate,double weight,int capacity)
	{
		System.out.println("Running String,int,String,String,String,boolean,double,int in Plate");
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.type=type;
		this.shape=shape;
		this.spikyPlate=spikyPlate;
		this.weight=weight;
		this.capacity=capacity;	
	}
}
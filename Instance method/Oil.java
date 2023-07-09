class Oil{
	String brand;
	int capacity;
	int noOfTypes;
	int price;
	String typeOfVehicle;
	Oil(String brand,int capacity,int noOfTypes,int price,String typeOfVehicle)
	{
		System.out.println("The oil is running");
		this.brand=brand;
		this.capacity=capacity;
		this.noOfTypes=noOfTypes;
		this.price=price;
		this.typeOfVehicle=typeOfVehicle;
	}
	void printingTheVariables()
	{
		System.out.println("brand:"+brand);
		System.out.println("capacity:"+capacity);
		System.out.println("noOfTypes:"+noOfTypes);
	    System.out.println("price:"+price);
		System.out.println("typeOfVehicle:"+typeOfVehicle);
	}
}
class Fish{
	String name="catfish";
	String type="blue";
	int price=745;
	String location="ocean";
	Fish()
	{
		System.out.println("The fish is small");
	}
	Fish(String name)
	{
		System.out.println("The fish  name is:"+name);
	}
	Fish(int price)
	{
		System.out.println("The fish price is:"+price);
		this.price=price;
	}
	Fish(String type,int price)
	{
		System.out.println("The location is:"+type);
		this.type=type;
		this.price=price;
	}
}
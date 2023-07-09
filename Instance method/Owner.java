class Owner{
	String name;
	int property;
	String gender;
	double height;
	double weight;
	Owner(String name,int property,String gender,double height,double weight)
	{
		System.out.println("The owner is running");
		this.name=name;
		this.property=property;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
	}
	void printingTheVariables()
	{
		System.out.println("name:"+name);
		System.out.println("property:"+property);
		System.out.println("gender:"+gender);
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
	}
}
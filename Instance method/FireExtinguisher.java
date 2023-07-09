class FireExtinguisher
{
	String type;
	int capacity;
	String color;
	String whereUse;
	boolean limited;
	FireExtinguisher(String type,int capacity,String color,String whereUse,boolean limited)
	{
		System.out.println("The FireExtinguisher is running");
	    this.type=type;
		this.capacity=capacity;
		this.color=color;
		this.whereUse=whereUse;
		this.limited=limited;
	}
	void printingTheVariables()
	{
		System.out.println("Running  the method");
		System.out.println("type:"+type);
		System.out.println("capacity:"+capacity);
		System.out.println("color:"+color);
		System.out.println("whereUse:"+whereUse);
		System.out.println("limited:"+limited);
	}
}
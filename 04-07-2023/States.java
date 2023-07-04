class States{
	String name="Andhra Pradesh";
	String capital="Amaravathi";
	int noOfStates=29;
	States()
	{
		System.out.println("the State is runnning");
	}
	States(String name)
	{
		System.out.println("the name is:"+name);
	}
	States(int noOfStates)
	{
		System.out.println("the price is:"+noOfStates);
	}
	States(String capital,int noOfStates)
	{
		System.out.println("running String,int");
	}
}
class StatesRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is runnig");
	    States state=new States();
		System.out.println(state.name);
		System.out.println(state.capital);
		System.out.println(state.noOfStates);
		States famous= new States("karnataka");
		System.out.println(famous.name);
		System.out.println(famous.capital);
		System.out.println(famous.noOfStates);
		States tourism=new States(28);
		System.out.println(tourism.name);
		System.out.println(tourism.capital);
		System.out.println(tourism.noOfStates);
		States temples=new States("banlore",24);
	}
}
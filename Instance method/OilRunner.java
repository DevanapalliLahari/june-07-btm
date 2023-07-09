class OilRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is running");
        Oil oil=new Oil("shell advance",1,4,100,"car");
		oil.printingTheVariables();
		System.out.println("updating");
		oil.brand="Castrol";
		oil.capacity=2;
		oil.noOfTypes=5;
		oil.price=150;
		oil.typeOfVehicle="bike";
		oil.printingTheVariables();
	}
}
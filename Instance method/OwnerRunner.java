class OwnerRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is running");
		Owner own=new Owner("john",8,"male",5.8,65);
		own.printingTheVariables();
		System.out.println("updated");
		own.name="Mary";
		own.property=6;
		own.height=5.4;
		own.weight=55;
		own.printingTheVariables();
	}
}
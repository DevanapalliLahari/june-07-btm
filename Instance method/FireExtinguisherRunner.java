class FireExtinguisherRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is running");
		FireExtinguisher fire=new FireExtinguisher("co2",14,"black","wood",true);
		fire.printingTheVariables();
		
		fire.type="water";
		fire.capacity=16;
		fire.color="red";
		fire.whereUse="paper";
		fire.limited=false;
		fire.printingTheVariables();
	}
}
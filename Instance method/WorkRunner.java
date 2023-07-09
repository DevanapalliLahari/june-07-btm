class WorkRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is running");
		Worker work=new Worker("Ram",8,"male",5.5,false);
		work.printingTheVariables();
		work.name="sam";
		work.workingHours=5;
		work.gender="male";
		work.height=5.8;
		work.educated=true;
		work.printingTheVariables();
	}
}

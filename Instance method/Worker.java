class Worker{
	String name;
	int workingHours;
	String gender;
	double height;
	boolean educated;
	Worker(String name,int workingHours,String gender,double height,boolean educated)
	{
		System.out.println("The worker is working");
		this.name=name;
		this.workingHours=workingHours;
		this.gender=gender;
		this.height=height;
		this.educated=educated;
	}
	void printingTheVariables()
	{
		System.out.println("name:"+name);
	    System.out.println("workingHours:"+workingHours);
		System.out.println("gender:"+gender);
		System.out.println("height:"+height);
		System.out.println("educated:"+educated);
	}
}
	
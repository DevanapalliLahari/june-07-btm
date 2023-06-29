class Wafer{
	String type;
	boolean vitamins=true;
	float potassium;
	float calories=4.33f;
	Wafer()
	{
		System.out.println("The class is running");
	}
}
class WaferRunning{
	public static void main(String[]args)
	{
		System.out.println("the main is running");
		Wafer wafer=new Wafer();
		System.out.println(wafer.type);
		System.out.println(wafer.vitamins);
		System.out.println(wafer.potassium);
		System.out.println(wafer.calories);
	}
}
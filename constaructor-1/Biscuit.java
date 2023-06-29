class Biscuit{
	String name="Oreo";
	double weight=00.50;
	float fat;
	String brand;
	Biscuit()
	{
		System.out.println("The biscuit is in circle shape");
	}
}
class BiscuitRunner{
	public static void main(String[]args)
	{
		Biscuit biscuit=new Biscuit();
		Biscuit type=new Biscuit();
		System.out.println(type.name);
		Biscuit flavour=new Biscuit();
		System.out.println(flavour.weight);
		Biscuit percentage=new Biscuit();
		System.out.println(percentage.fat);
		Biscuit pack=new Biscuit();
		System.out.println(pack.brand);
	}
}
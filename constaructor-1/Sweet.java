class Sweet{
		String name="Halwa";
		int price=150;
		double weight;
		String place;
		Sweet()
		{
			System.out.println("The sweet shop is running");
		}
}
class SweetRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is running");
		Sweet sweet=new Sweet();
		System.out.println(sweet.name);
		System.out.println(sweet.price);
		System.out.println(sweet.weight);
		System.out.println(sweet.place);
	}
}
		
		
class KebabRunner
{
	public static void main(String[]args)
	{
		System.out.println("The main method is running");
		Kebab kebab=new Kebab();
		System.out.println(kebab.name);
		System.out.println(kebab.price);
		System.out.println(kebab.hotelName);
		System.out.println(kebab.noOfPieces);
		System.out.println(kebab.takeAway);
		Kebab incridients=new Kebab("mutton kebab");
		System.out.println(incridients.name);
		System.out.println(incridients.price);
		System.out.println(incridients.hotelName);
		System.out.println(incridients.noOfPieces);
		System.out.println(incridients.takeAway);
		Kebab spices=new Kebab(500);
		System.out.println(spices.name);
		System.out.println(spices.price);
		System.out.println(spices.hotelName);
		System.out.println(spices.noOfPieces);
		System.out.println(spices.takeAway);
		Kebab taste=new Kebab("babulal Hotel",20);
		System.out.println(taste.name);
		System.out.println(taste.price);
		System.out.println(taste.hotelName);
		System.out.println(taste.noOfPieces);
		System.out.println(taste.takeAway);
		Kebab fresh=new Kebab(true);
		System.out.println(fresh.name);
		System.out.println(fresh.price);
		System.out.println(fresh.hotelName);
		System.out.println(fresh.noOfPieces);
		System.out.println(fresh.takeAway);
	}
}
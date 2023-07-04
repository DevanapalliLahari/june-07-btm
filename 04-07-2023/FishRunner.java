class FishRunner{
	public static void main(String[]args)
	{
		System.out.println("The main method is runnig");
	    Fish fish=new Fish();
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.location);
		Fish wels= new Fish("red tail catFish");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.location);
		Fish pictus=new Fish("channel aatFish",400);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.location);
		Fish dolphin=new Fish("rainbow trout",300);
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.location);
	}
}
		
	
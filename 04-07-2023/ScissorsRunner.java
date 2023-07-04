class ScissorsRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Scissors scissors=new Scissors();
		System.out.println(scissors.brand);
		System.out.println(scissors.color);
		System.out.println(scissors.type);
		System.out.println(scissors.usage);
		System.out.println(scissors.size);
		System.out.println(scissors.material);
		System.out.println(scissors.price);
		
		Scissors fingerRing=new Scissors();
		System.out.println(fingerRing.brand);
		System.out.println(fingerRing.color);
		System.out.println(fingerRing.type);
		System.out.println(fingerRing.usage);
		System.out.println(fingerRing.size);
		System.out.println(fingerRing.material);
		System.out.println(fingerRing.price);
		
		Scissors stopper=new Scissors(2);
		System.out.println(stopper.brand);
		System.out.println(stopper.color);
		System.out.println(stopper.type);
		System.out.println(stopper.usage);
		System.out.println(stopper.size);
		System.out.println(stopper.material);
		System.out.println(stopper.price);
		
		Scissors spine=new Scissors(60);
		System.out.println(spine.brand);
		System.out.println(spine.color);
		System.out.println(spine.type);
		System.out.println(spine.usage);
		System.out.println(spine.size);
		System.out.println(spine.material);
		System.out.println(spine.price);
		
		Scissors point=new Scissors("black",7);
		System.out.println(point.brand);
		System.out.println(point.color);
		System.out.println(point.type);
		System.out.println(point.usage);
		System.out.println(point.size);
		System.out.println(point.material);
		System.out.println(point.price);
		
		Scissors pointScrew=new Scissors("cut",63);
		System.out.println(pointScrew.brand);
		System.out.println(pointScrew.color);
		System.out.println(pointScrew.type);
		System.out.println(pointScrew.usage);
		System.out.println(pointScrew.size);
		System.out.println(pointScrew.material);
		System.out.println(pointScrew.price);
		
		Scissors rideLine=new Scissors();
		System.out.println(rideLine.brand);
		System.out.println(rideLine.color);
		System.out.println(rideLine.type);
		System.out.println(rideLine.usage);
		System.out.println(rideLine.size);
		System.out.println(rideLine.material);
		System.out.println(rideLine.price);
	}
}
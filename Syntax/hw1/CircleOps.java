class CircleOps 
{
	public static void main(String[] args)
	{
		int r = Integer.valueOf(args[0]);
		if(r < 0)
			System.out.println("enter right radius");
		else
		{
			System.out.println("length is " + 2 * 3.14 * r);
			System.out.println("area is " + r * r * 3.14);
		}
	}
}
class CalculatingSum7
{
	public static void main(String[] args)
	{
		int number = Integer.valueOf(args[0]);
		if(number < 0)
			System.out.println("Enter correct number");
		else
		{
			double result = 1;
			boolean bln = false;
			double lowerNum = 3;
			for(int i = 1; i < number; i++)
			{
				if(bln)
				{
					result = result + 1 / (lowerNum * lowerNum);
					bln = false;
				}
				else
				{
					result = result - 1 / (lowerNum * lowerNum);
					bln = true;
				}
				lowerNum = lowerNum + 2;
			}
			System.out.println("Answer is " + result);
		}
	}
}
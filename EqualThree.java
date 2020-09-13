import java.util.Scanner;

class EqualThree
{
	public static void main(String[] Args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter first number");
		int k = scr.nextInt();
		System.out.println("Enter second number");
		int m = scr.nextInt();

		for(int i = k + 1; i < m; i++)
		{
			if(i % 3 == 0)
				System.out.println(i);
		}
	}
}
import java.util.Scanner;

//класс для решения трифорса через трифорсы
class Triforce
{
	public static void main(String[] Args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter height");
		int height = scr.nextInt();
		// убираем исключение
		if(height == 1)
		{
			System.out.println(" *");
			System.out.println("* *");
		}

		else
		{
			//находим последнюю полосу, чтобы рассчитать, где будет первая звезда
			int lastLength = findLength(height);
			//у трифорса определенной высоты есть свои константные пробелы
			int emptySpaces = lastLength / 2 - 1;

			//высчитываем кол-во пробелов до верхнего трифорса
			int spacesBefore = findLength(height) + emptySpaces;
			//кол-во пробелов между двумя трифорсами
			int spacesBetween = spacesBefore + emptySpaces;

			/*
				^^^^^^^##*
				#^^^^^##***
				##^^^##*****
				###^##*******
				###*##^^^^^^^##*
				##***##^^^^^##***
				#*****##^^^##*****
				*******##^##*******
				где ^ - трифорс из пробелов, # - константные пробелы
			*/

			//строим верхний трифорс
			for(int i = 0; i < height; i++)
			{
				print(spacesBefore, " ");
				spacesBefore = spacesBefore - 1;
				print(findLength(i+1), "*");
				System.out.println();
			}

			//пробелы до левого трифорса
			spacesBefore = height - 1;

			//строим нижние трифорсы
			for(int i = 0; i < height; i++)
			{
				print(spacesBefore, " ");
				spacesBefore = spacesBefore - 1;
				print(findLength(i+1), "*");
				print(spacesBetween, " ");
				spacesBetween = spacesBetween - 2;
				print(findLength(i+1), "*");
				System.out.println();
			}
		}
	}

	//метод для печатания " " и "*" опр. кол-ва
	public static void print(int number, String symbol)
	{
		for(int i = 0; i < number; i++)
		{
			System.out.print(symbol);
		}
	}

	//метод для поиска длины определенной линии
	public static int findLength(int height)
	{
		int length = 1;
		if(height != 1)
		{
			for(int i = 1; i < height; i++)
			{
				length = length + 2;
			}
		}
		return length;
	}
}
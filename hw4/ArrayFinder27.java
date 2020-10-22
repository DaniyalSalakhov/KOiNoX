import java.util.Scanner;

class ArrayFinder27{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		int[] array5 = new int[5];
		int[] array10 = new int[10];

		System.out.println("Enter smaller array");
		for(int e : array5){
			e = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Enter bigger array");
		for(int e : array10){
			e = Integer.parseInt(sc.nextLine());
		}

		int index = -1;
		for(int i = 0; i < array10.length - array5.length; i++){
			index = i;
			for(int k = 0; k < array5.length; k++){
				if(array5[k] != array10[i + k]){
					index = -1;
					break;
				}
			}
			if(index != -1){
				break;
			}
		}
		System.out.println(index);
	}
}
import java.util.Scanner;

class PascalTriangle26{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		
		int arrN = 0;
		for(int i = 1; i <= n; i++){
			arrN = arrN + i;
		}
		/*
		int[] array = new int[arrN];
		array[0] = 1;
		array[1] = 1; 
		array[2] = 1;

		System.out.println(array[0]);
		System.out.println(array[1] + array[2]);

		for(int i = 1; i < arrN - 2; i++){
			for(int k = i + 1; k < i + 2; k++){
				System.out.print[1 + " "];
				
			}
		}
		*/
		System.out.println(1);
		int[] array1 = {1, 1};
		int[] array2 = new int[array1.length + 1];

		for(int i = 1; i < n; i++){
			array2[0] = 1;
			for(int l = 0; l < array1.length - 1; l++){
				array2[l + 1] = array1[l];
				array2[l + 1] = array2[l + 1] + array1[l];
			}
			array2[array2.length - 1] = 1;
			for(int j = 0; j < array2.length; j++){
				System.out.print(array2[j]+ " ");
			}
			System.out.println();
			array1 = array2;
			array2 = new int[array2.length + 1];
		}
	}
}
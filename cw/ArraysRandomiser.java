import java.util.Arrays;
import java.util.Random;

class ArraysRandomiser{
	public static void main(String[] args){
		int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++){
			arr[i] = 2 + (int) (Math.random() * 30);
		}
		System.out.println(Arrays.toString(arr));

		int swapper;
		for(int i = 0; i < arr.length; i++){
			for(int j = arr.length - 1; j > i; j--){
				if(arr[j - 1] > arr[j]){
					swapper = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = swapper;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		double result = 1;
		for(int i = 0; i < arr.length; i++){
			result = result * arr[i];
		}
		result = Math.sqrt(result);
		result = Math. 
		System.out.println(result);
	}
}
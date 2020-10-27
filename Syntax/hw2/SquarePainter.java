class SquarePainter{
	public static void main(String[] args){
		int number = Integer.parseInt(args[0]);

		for(int i = 0; i < number; i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1; i < number - 1; i++){
			System.out.print("*");
			for(int k = 1; k < number - 1; k++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i = 0; i < number; i++){
			System.out.print("*");
		}
	}
}
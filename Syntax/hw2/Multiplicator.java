class Multiplicator{
	public static void main(String[] args){
		int max = Integer.parseInt(args[0]);

		for(int i = 1; i <= max; i++){
			for(int k = 1; k <=max; k++){
				System.out.print(i * k);
			}
			System.out.println();
		}
	}
}
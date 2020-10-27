class Fact{
	public static void main(String[] args){
		int number = Integer.parseInt(args[0]);

		double result = 1;
		for(int i = 1; i <= number; i++){
			result = result * i;
		}
		System.out.println("Answer is " + result);
	}
}
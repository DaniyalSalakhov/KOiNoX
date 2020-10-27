class CalculatingSum6
{
	public static void main(String[] args){
		int number = Integer.valueOf(args[0]);
		if(number < 1){
			System.out.println("Enter correct number");
		}
		else if(number == 1){
			System.out.println("Answer is 0");
		}
		else{
			double result = 0;
			double lower = 1;
			double upper = 1;
			for(int i = 1; i <= number; i++){
				for(int u = i - 1; u > 0; u--) upper = upper * u;
				for(int l = 2 * i; l > 0; l--) lower = lower * l;
				result = result + upper * upper / lower;
				upper = 1;
				lower = 1;
			}
			System.out.println("Answer is " + result);
		}
	}
}
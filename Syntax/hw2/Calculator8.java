class Calculator8
{
	public static void main(String[] args){
		int number = Integer.valueOf(args[0]);
		double x = Double.valueOf(args[1]);
		if(number < 1 || number % 1 > 0){
			System.out.println("Enter correct number");
		}
		else{
			double result;
			x = Math.toRadians(x);
			result = Math.cos(x);
			for(int i = number; i > 1; i--){
				result = Math.toRadians(result);
				result = Math.cos(x + result);
			}
			System.out.println("Answer is " + Math.round(result));
		}
	}
}
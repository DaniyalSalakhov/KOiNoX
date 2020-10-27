class CalculatingSum5
{
	public static void main(String[] args){
		int number = Integer.valueOf(args[0]);
		double x = Integer.valueOf(args[1]);
		if(number < 1){
			System.out.println("Enter right number");
		}
		else{
			double denominator = 0;
			double result;
			for(int i = number; i > 0; i--){ 
				denominator = x / (i + 1 + denominator);
			}
			result = 1 + denominator;
			System.out.println("Answer is " + result);
		}
	}
}
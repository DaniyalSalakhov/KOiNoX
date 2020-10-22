class WallisProduct
{
	public static void main(String[] args){
		int number = Integer.valueOf(args[0]);
		if(number < 0){
			System.out.println("enter right number");
		}
		else{
			double upperNum = 2;
			double lowerNum1 = 1;
			double lowerNum2 = 3;
			double result = 1;
			for(int i = 0; i < number; i++){
				result = result * (upperNum * upperNum) / (lowerNum1 * lowerNum2);
				upperNum = upperNum + 2;
				lowerNum1 = lowerNum2;
				lowerNum2 = lowerNum2 + 2;
			}
			System.out.println("Answer is " + result * 2);
		}
	}
}
class VariablesSwapper{
	public static void main(String[] args){
		double number1 = Integer.parseInt(args[0]);
		double number2 = Integer.parseInt(args[1]);

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("number1 = " + number1 + "; number2 = " + number2);
	}
}
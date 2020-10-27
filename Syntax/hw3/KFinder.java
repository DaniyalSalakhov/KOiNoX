class KFinder15{
	public static void main(String[] args){
		int k = Integer.parseInt(args[0]);
		double first = Double.parseDouble(args[1]);
		double second = Double.parseDouble(args[2]);
		double d = second - first;

		double result = first;
		for(int i = 1; i < k; i++){
			result = result + d;
		}
		System.out.println("Answer is " + result);
	}
}
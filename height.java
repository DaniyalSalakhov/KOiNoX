class height {
	public static void main(String[] args) {
		int sec = Integer.valueOf(args[0]);
		if(sec < 0) {
			System.out.println("Seconds must be more than 0");
		}
		final int g = 10;
		int height = g * sec * sec / 2;
		System.out.println(height);
	}
}
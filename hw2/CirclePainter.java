class CirclePainter{
	public static void main(String[] args){
		int r = Integer.parseInt(args[0]);
		int y = r;
		int x = r;

		for(int dotY = 0; dotY <= r * 2; dotY++){
			for(int dotX = 0; dotX <= r * 2; dotX++){

				if(isDotInside(dotX, dotY, x, y, r))
					System.out.print(" *");

				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	static boolean isDotInside(int dotX, int dotY, int x, int y, int r){
		int dot = (x - dotX) * (x - dotX) + (y - dotY) * (y - dotY);
		int circle = r * r;
		return dot <= circle;
	}
}
class CircleInside{
	public static void main(String[] args){
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		int dotX = Integer.parseInt(args[3]);
		int dotY = Integer.parseInt(args[4]);
		
		int dot = (x - dotX) * (x - dotX) + (y - dotY) * (y - dotY);
		int circle = r * r;

		boolean result = dot <= circle;
		if(result)
			System.out.println("Точка лежит на/внутри окружности");
		else
			System.out.println("Точка не лежит на/внутри окружности")
	}
}
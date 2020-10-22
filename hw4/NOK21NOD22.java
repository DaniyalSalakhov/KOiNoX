import java.util.Scanner;

class NOK21NOD22{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		if(n1 < n2){
			int swap;
			swap = n1;
			n1 = n2;
			n2 = swap;
		}

		if(n1 % n2 == 0){
			System.out.println(n1);
		}
		else if(n2 % n1 == 0){
			System.out.println(n2);
		}
		else{
			System.out.println(n1 * n2 / nodEvklid(n1, n2));
		}
		System.out.println(nodFinder(n1, n2));
		System.out.println(nodEvklid(n1, n2));

	}

	static int nodFinder(int n1, int n2){
		int nod = 0;
		for(int i = 1; i < n2; i++){
			if(n2 % i == 0 && n1 % i == 0){
				nod = i;
			}
		}
		return nod;
	}

	static int nodEvklid(int n1, int n2){
		for(int i = 1; i < n1 / 2 + 1; i++){
			if(n1 > n2 && n2 > n1 - n2 * i){
				n1 = n1 - n2 * i;
				i = 1;
				if(n2 % n1 == 0)
					return n1;
			}
			if(n2 > n1 && n1 > n2 - n1 * i){
				n2 = n2 - n1 * i;
				i = 1;
				if(n1 % n2 == 0)
					return n2;
			}
		}
		return -1;
	}
}
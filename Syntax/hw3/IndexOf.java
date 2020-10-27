class IndexOf{
	public static void main(String[] args){
		String string1 = args[0];
		String string2 = args[1];

		if(string1.length() >= string2.length()){
			isEqualsIndex(string1.toLowerCase(), string2.toLowerCase());
		}

		else{
			isEqualsIndex(string2.toLowerCase(), string1.toLowerCase());
		}

	}

	static void isEqualsIndex(String sB, String sS){
		if(sB.contains(sS)){
			String substr;
			for(int i = 0; i < sB.length(); i++){
				if(sS.length() - 1 + i < sB.length()){
					substr = sB.substring(i, sS.length() + i);
					if(substr.equals(sS)){
						System.out.println(i);
					}
				}
			}
		}
		else{
			System.out.println("Подстрока не содержится в строке.");
		}
	}
}
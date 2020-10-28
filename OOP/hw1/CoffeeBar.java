package oop.hw1;
import oop.hw1.Barista;

public class CoffeeBar{
	public static void main(String[] Args){
		Barista artemida = new Barista("Artemida");
		artemida.setPost("probationer");
		artemida.setSalary(121);
		String[] responsibilities = {"Do coffee", "Wash floor", "get and bring orders"};
		artemida.setResponsibilities(responsibilities);
		artemida.addTip(50);
		artemida.getInfo();
	}
}
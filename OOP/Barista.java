package oop.hw1;

public class Barista{
	private String name;
	private String post;
	private int salary;
	private String[] responsibilities;
	private int money;

	public Barista(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPost(String post){
		this.post = post;
	}

	public String getPost(){
		return post;
	}

	public void setSalary(int salary){
		if(salary >=120 && salary <= 180)
			this.salary = salary;
	}

	public int getSalary(){
		return salary;
	}

	public void setResponsibilities(String[] responsibilities){
		this.responsibilities = responsibilities;
	}

	public String[] getResponsibilities(){
		return responsibilities;
	}

	public void addTip(int tip){
		if(tip > 0)
			money = money + tip;
	}

	public int getMoney(){
		return money;
	}

	public void doCoffee(String typeOfCoffee){
		System.out.println("Here's your + " + typeOfCoffee);
	}

	public void getInfo(){
		System.out.println("My name is " + name);
		System.out.println("I am working as a " + post);
		System.out.println("My salary is " + salary);
		System.out.println("My responsibilities are to " + responsibilities);
		System.out.println("I have " + money + " rub.");
	}
}
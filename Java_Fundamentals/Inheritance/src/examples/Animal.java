package examples;

public class Animal {
	private String name;
	
	public Animal() {
		this.name = "POOP";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("I AM ANIMAL!");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void whoAmI() {
		System.out.println("I think, therefore I am!");
	}
}

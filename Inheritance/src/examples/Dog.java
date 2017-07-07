package examples;

public class Dog extends Animal {
	private String name;
	
	public Dog() {
		this.name = "Dog";
	}
	
	public void speak() {
		System.out.println("WOOF WOOF!");
	}

}

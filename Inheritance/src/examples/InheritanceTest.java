package examples;

public class InheritanceTest {
	public static void main(String[] args) {
		Animal pooper = new Animal();
		Dog woofer = new Dog();
		
		pooper.whoAmI();
		woofer.whoAmI();
		
		pooper.speak();
		woofer.speak();
	}

}

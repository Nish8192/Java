package examples;

public class RobotTester {
	public static void main(String[] args) {
		Robot nishant = new Robot(100, "Nishant");
		Robot poop = new Robot("poop");
		nishant.travel();
		poop.travel();
	}
}

package examples;

public class RobotTester {
	public static void main(String[] args) {
		Robot nishant = new Robot();
		nishant.setMaxSpeed(500);
		nishant.travel();
		System.out.println(nishant.getMaxSpeed());
	}
}

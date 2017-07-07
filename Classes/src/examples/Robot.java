package examples;

public class Robot {
	private int maxSpeed;
	
	public Robot() {
		this.maxSpeed = 21;
	}
	
	public Robot(int startSpeed) {
		this.maxSpeed = startSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int speed) {
		if(speed >= 0) {
			this.maxSpeed = speed;
		}
		else {
			this.maxSpeed = 0;
			System.out.println("I wanna go fast!!");
		}
	}
	
	public void travel() {
		System.out.println("I'm moving " + this.maxSpeed + "!! So FAST!!");
	}

}

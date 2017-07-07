package examples;

public class Robot {
	private int maxSpeed;
	private String name;
	
	public Robot() {
		this.maxSpeed = 21;
		this.name = "Nishant";
	}
	
	public Robot(int startSpeed) {
		this.maxSpeed = startSpeed;
		this.name = "Nishant";
	}
	
	public Robot(int startSpeed, String name) {
		this.maxSpeed = startSpeed;
		this.name = name;
	}
	
	public Robot(String name) {
		this.name = name;
		this.maxSpeed = 21;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
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
		System.out.println(this.name + " is moving at " + this.maxSpeed + "!! So FAST!!");
	}

}

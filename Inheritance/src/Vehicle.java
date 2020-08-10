
public class Vehicle {
	private String name;
	private int size;
	
	private int currentVelocity;
	private int currentDirection;
	public Vehicle(String name, int size) {
		super();
		this.name = name;
		this.size = size;
		this.currentVelocity = 0;
		this.currentDirection =0;
	}
	public void steer(int direction) {
		
		this.currentDirection += direction;
		System.out.println("Vehilce.steer() Steering at " + currentDirection + "degrees");
	}
	
	
	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehile.move(): Moving at "+currentVelocity+ " at "+ currentDirection+ " degrees");
	}
	public void stop() {
		this.currentVelocity = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
}

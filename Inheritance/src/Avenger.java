
public class Avenger extends Car {
	private int roadServiceMonths;

	

	public Avenger( int roadServiceMonths) {
		super("Avenger", 3, 5, 5, 6, false);
		this.roadServiceMonths = roadServiceMonths;
	}

	public int getRoadServiceMonths() {
		return roadServiceMonths;
	}

	public void setRoadServiceMonths(int roadServiceMonths) {
		this.roadServiceMonths = roadServiceMonths;
	}
	
	
	
	public void accelerate(int rate) {
		int newVelocity = getCurrentVelocity() + rate;
		
		if (newVelocity == 0) {
			stop();
		}
		else if(newVelocity > 0 && newVelocity <=10) {
			setCurrentGear(2);
		}
		else {
			setCurrentGear(4);
		}
		if(newVelocity>0) {}
		changeVelocity(newVelocity,getCurrentDirection());
	}
	
}

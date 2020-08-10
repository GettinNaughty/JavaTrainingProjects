
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimensions dimensions = new Dimensions(20, 20,5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		Monitor monitor = new Monitor("Asus Rock","Asus", 27,new Resolution(2540, 1440));
		Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
		PC thePC = new PC(theCase, monitor, motherboard);
		thePC.powerUp();
		
		LivingRoom theLivingRoom = new LivingRoom(new Couch(4,5,"King Couch"), new TV(30,12,"Plasma"),new Fireplace(20,15,"Yule"));
		theLivingRoom.getCouch().sitOnCouch();
		theLivingRoom.goToWatchTV();
	}

}

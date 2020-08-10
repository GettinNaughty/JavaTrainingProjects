
public class LivingRoom {
	private Couch couch;
	private TV tv;
	private Fireplace fireplace;
	public LivingRoom(Couch couch, TV tv, Fireplace fireplace) {
		super();
		this.couch = couch;
		this.tv = tv;
		this.fireplace = fireplace;
	}
	public Couch getCouch() {
		return couch;
	}
	public void setCouch(Couch couch) {
		this.couch = couch;
	}
	private TV getTv() {
		return tv;
	}
	private void setTv(TV tv) {
		this.tv = tv;
	}
	private Fireplace getFireplace() {
		return fireplace;
	}
	private void setFireplace(Fireplace fireplace) {
		this.fireplace = fireplace;
	}
	public void goToWatchTV() {
		tv.watchTV();
	}
	
}

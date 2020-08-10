
public class Case {
	private String model;
	private String manufacturer;
	private String powersupply;
	private Dimensions dimesions;
	public Case(String model, String manufacturer, String powersupply, Dimensions dimesions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powersupply = powersupply;
		this.dimesions = dimesions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getPowersupply() {
		return powersupply;
	}

	public void setPowersupply(String powersupply) {
		this.powersupply = powersupply;
	}

	public Dimensions getDimesions() {
		return dimesions;
	}

	public void setDimesions(Dimensions dimesions) {
		this.dimesions = dimesions;
	}
	
}

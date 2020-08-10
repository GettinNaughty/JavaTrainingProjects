
public class Couch {
	private int width;
	private int height;
	private String type;
	public Couch(int width, int height, String type) {
		super();
		this.width = width;
		this.height = height;
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void sitOnCouch() {
		System.out.println("I am sitting on my "+this.type);
	}
}

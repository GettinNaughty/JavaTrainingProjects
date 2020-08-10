
public class Point {
	private int x;
	private int y;
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		double result = Math.sqrt((0-x)*(0-x) + (0-y)*(0-y));
		return result;
	}
	public double distance(int x, int y) {
		double result = Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
		return result;
	}
	public double distance(Point point) {
		double result = Math.sqrt((this.x-point.getX())*(this.x-point.getX()) + (this.y-point.getY())*(this.y-point.getY()));
		return result;
	}
}

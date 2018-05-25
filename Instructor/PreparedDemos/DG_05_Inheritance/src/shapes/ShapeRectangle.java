package shapes;

public class ShapeRectangle extends Shape {
	
	// Demo 6.06 - Set up a Rectangle
	private int height;
	private int width;
	
	public ShapeRectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	@Override
	public String toString() {
		return "ShapeRectangle [height=" + height + ", width=" + width + ", getArea()=" + getArea() + "]";
	}
	
	
}

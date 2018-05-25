package shapes;

public class ShapeCircle extends Shape {
	
	// Demo 6.07 - Set up a circle
	private double radius;

	public ShapeCircle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "ShapeCircle [radius=" + radius + ", getArea()=" + getArea() + "]";
	}
	
}

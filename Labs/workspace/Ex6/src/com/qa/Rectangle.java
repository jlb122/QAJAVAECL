package com.qa;

public class Rectangle extends Shape{

	//fields, not available in shape
	private double height, width;
	
	//constructor that calls the Shape constructor
	public Rectangle(String name, String colour, double x, double y, double width, double height) {
		super(name, colour, x, y);
		this.width = width;
		this.height = height;
	}

	//method - not available in Circle
	public boolean isSqaure(){
		return (width == height);
	}
	
	//override the abstract methods in the Shape class 
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public Point getCenterPoint() {
		double centerX = super.getX() + width/2;
		double centerY = super.getY() + height/2;
		return new Point(centerX, centerY);
	}

	//override the method in the Object class
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width
				+ ", isSqaure()=" + isSqaure() + ", getArea()=" + getArea()
				+ ", getCenterPoint()=" + getCenterPoint() + ", getX()="
				+ getX() + ", getY()=" + getY() + ", getName()=" + getName()
				+ ", getColour()=" + getColour() + "]";
	}

	

}

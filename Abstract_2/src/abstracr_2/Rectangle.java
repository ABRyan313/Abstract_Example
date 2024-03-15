package abstracr_2;

public class Rectangle extends Shape {
	
	double length;
	double width;
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	double area() {
		
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]" + " " + "Area = " + area();
	}
	
	

}

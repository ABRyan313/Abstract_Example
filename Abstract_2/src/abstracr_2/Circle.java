package abstracr_2;

public class Circle extends Shape {
	
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
    double area() {
		return Math.PI * Math.pow(2, radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]" + super.color + " " + "Area = " + area();
	}
    

}

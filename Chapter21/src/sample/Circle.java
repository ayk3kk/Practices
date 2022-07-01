package sample;

public class Circle extends Shape {

	private double radius; //半径

	protected Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String getName() {
		return "円形";
	}

	@Override
	public double area() {
		return this.radius * this.radius * Math.PI;
	}

}

import java.util.*;
public class Circle {
	
	private static double Math_PI = 3.14159;
	private static double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.round(2 * Math_PI * this.radius * this.radius);
	}
	
	public double circumference() {
		return Math.round(2 * this.radius * Math_PI);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String toString() {
		return "Circle{radius=" + this.radius + "}";
	}
}

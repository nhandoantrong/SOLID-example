package openClosed.openClosedViolation;

public class AreaCalculator {
	public double calculateReactagleArea(Rectangle rectangle) {
		return rectangle.length*rectangle.width;
	}
	public double calculateCircleArea(Circle circle) {
		return 3.14*circle.radius*circle.radius;
	}
}

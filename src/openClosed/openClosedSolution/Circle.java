package openClosed.openClosedSolution;

public class Circle implements Shape{
	public double radius;

	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}
}

package openClosed.openClosedSolution;

public class Rectangle implements Shape{
	public double length;
	public double width;
	@Override
	public double calculateArea() {
		return length*width;
	}
}

package prob6;

public class RectTriangle extends Shape{

	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	double getArea() {
		double area = this.height*this.width/2;
		return area;
	}

	@Override
	double getPerimeter() {
		double perimeter = this.height + this.width + Math.sqrt(this.height*this.height+this.width*this.width);
		return perimeter;
	}

}

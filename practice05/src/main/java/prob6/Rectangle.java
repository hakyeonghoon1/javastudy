package prob6;

public class Rectangle extends Shape implements Resizable{
	
	private double width;
	private double height;
	
	public Rectangle (double w, double h) {
		this.width=w;
		this.height=h;
	}
	
	@Override
	double getArea() {
		double area = this.height*this.width;
		return area;
	}

	@Override
	double getPerimeter() {
		double perimeter = this.height*2 + this.width*2;
		return perimeter;
	}

	@Override
	public void resize(double s) {
		this.width = this.width*s;
		
	}

}

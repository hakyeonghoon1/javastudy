package com.douzone.paint.main;

import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rectangle;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		
		Point point1 = new Point(10,10);
		
		//point1.setX(10);
		//point1.setY(10);
		
		//drawPoint(point1);
		
		point1.show(false);
		
		ColorPoint colorPoint1 = new ColorPoint();
		colorPoint1.setX(100);
		colorPoint1.setY(100);
		colorPoint1.setColor("red");
		//drawColorPoint(colorPoint1);
		
		Point Point2 = new ColorPoint(100,200,"red");
		Point2.setX(100);
		Point2.setY(100);
		((ColorPoint)Point2).setColor("red");
		//drawPoint(Point2);
		
		Point2.show(false);
		Point2.show(true);
		
		Triangle t1 = new Triangle();
		//drawShape(t1);
		
		Rectangle rec = new Rectangle();
		//drawShape(rec);
		
		Circle c1 = new Circle();
		//drawShape(c1);
		draw(c1);
		
		GraphicText text = new GraphicText("Hello World");
		draw(text);
		
		//instanceof test
		System.out.println(c1 instanceof Object);
		System.out.println(c1 instanceof Shape);
		System.out.println(c1 instanceof Circle);
		// 오류 : class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		// System.out.println(c1 instanceof Rectangle);
		
		// interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(c1 instanceof Drawable);
		System.out.println(c1 instanceof Runnable);
		
	}
	
	public static void draw(Drawable draw) {
		draw.draw();
	}
	
	/*
	public static void drawPoint(Point point) {
		point.show();
	}
	
	public static void drawColorPoint(ColorPoint colorPoint) {
		colorPoint.show();
	}
	/*
	public static void drawTriangle(Triangle triangle) {
		triangle.draw();
	}
	public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw();
	}
	public static void drawCircle(Circle circle) {
		circle.draw();
	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	 */
}

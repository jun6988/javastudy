package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.ColorPoint;
import com.bitacademy.paint.point.Point;
import com.bitacademy.paint.shape.Circle;
import com.bitacademy.paint.shape.Rectangle;
import com.bitacademy.paint.shape.Shape;
import com.bitacademy.paint.shape.Triangle;
import com.bitacademy.paint.text.GraphicText;

//import java.util.ArrayList; // 앞은 페키지 arraylist는 클래스
//import java.util.LinkedList;
//
//import java.util.*; // 모든 것을 임포트

public class Main {

	public static void main(String[] args) {
		
		Point pt1 = new Point(10, 50); // point 클래스에서 기본 생성자 생성 하여 오류 나서 밑에 주석하고 값 넣어줌
//		pt1.setX(10);
//		pt1.setY(50);
		
		//drawPoint(pt1);
		//pt1.disappear();
		// 오버로딩
		draw(pt1);
		pt1.show(false);
		
		// 기본 생성자
//		ColorPoint pt2 = new ColorPoint();
//		pt2.setX(100); // 코드 재사용
//		pt2.setY(200);
//		pt2.setColor("red");
		
		// 객체를 만드는 코드 (수정x)
		Point pt2 = new ColorPoint(100, 200, "red");
//		pt2.setX(100); // 코드 재사용
//		pt2.setY(200);
//		// 다운 케스팅 >> colorpoint가 아닌 point(부모) 참조 / 주차장 
//		((ColorPoint)pt2).setColor("red");
		draw(pt2);
		
		// 다운 케스팅 수정없이 기본 것 쓸 수 있다
//		drawColorPoint(pt2);
		//drawPoint(pt2);
		pt2.show(false);
		// point에서 if문에서 오바라이드 되어있기 때문에 안해도된다
//		pt2.show(true);
		
		Triangle triangle = new Triangle();
		//drawShape(triangle);
		draw(triangle);
		
		Rectangle rectangle = new Rectangle();
		//drawShape(rectangle);
		draw(rectangle);
		
		Circle circle = new Circle();
		//drawShape(circle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
		
		// instanceof test (of 붙으면 함수) 상속이 됬냐 안됬냐
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류 : class는 계층도(hierachy) 상위와 하위만 instanceof 연산자를 사용할 수 있다. (남은 물어볼 수 없다)
		// System.out.println(circle instanceof Rectangle);
		// System.out.println(circle instanceof String); (맨 밑에 있어서 못쓴다 / 부모를 써야함)
		// // object면 모든 instance를 물어볼 수 있다
		// Object o = circle;
		// System.out.println(o instanceof String);
		
		// 하지만, inerface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable); // 인터페이스 안에 구현했냐 안했냐
		
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawPoint(Point pt) {
//		pt.show();
//	}
//	// 다운케스팅
////	public static void drawColorPoint(ColorPoint pt) {
////		pt.show();
////	}
//	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
}

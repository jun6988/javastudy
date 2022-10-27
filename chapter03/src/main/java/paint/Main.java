package paint;

public class Main {

	public static void main(String[] args) {
		
		Point pt1 = new Point(10, 50); // point 클래스에서 기본 생성자 생성 하여 오류 나서 밑에 주석하고 값 넣어줌
//		pt1.setX(10);
//		pt1.setY(50);
		
		drawPoint(pt1);
		//pt1.disappear();
		// 오버로딩
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
		
		// 다운 케스팅 수정없이 기본 것 쓸 수 있다
//		drawColorPoint(pt2);
		drawPoint(pt2);
		pt2.show(false);
		// point에서 if문에서 오바라이드 되어있기 때문에 안해도된다
//		pt2.show(true);
		
		Triangle triangle = new Triangle();
		drawShape(triangle);
		
		Rectangle rectangle = new Rectangle();
		drawShape(rectangle);
		
		Circle circle = new Circle();
		drawShape(circle);
	}
	
	public static void draw(IDrawable drawble) {
		
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}
	// 다운케스팅
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
}

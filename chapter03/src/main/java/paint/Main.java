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
		ColorPoint pt2 = new ColorPoint();
		pt2.setX(100); // 코드 재사용
		pt2.setY(200);
		pt2.setColor("red");
		
		drawColorPoint(pt2);
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}
	
	public static void drawColorPoint(ColorPoint pt) {
		pt.show();
	}
}

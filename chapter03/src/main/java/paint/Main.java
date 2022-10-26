package paint;

public class Main {

	public static void main(String[] args) {
		
		Point pt = new Point(10, 50); // point 클래스에서 기본 생성자 생성 하여 오류 나서 밑에 주석하고 값 넣어줌
//		pt.setX(10);
//		pt.setY(50);
		
		drawPoint(pt);
		//pt.disappear();
		// 오버로딩
		pt.show(false);
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}
}

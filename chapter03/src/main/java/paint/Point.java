package paint;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	// 오버로딩 진짜로 하는 것 (시그너쳐 다르게 하여)
	public void show(boolean visible) {
		if(visible) {
			//System.out.println("점(x=" + x + ", y=" + y + ")를 그렸습니다.");
			show(); // 있는 코드 활용
		} else {
			System.out.println("점(x=" + x + ", y=" + y + ")를 지웠습니다.");
		}
	}
	public void show() { // 위 void show가 같아야한다
		System.out.println("점(x=" + x + ", y=" + y + ")를 그렸습니다.");
	}
//	public void disappear() {
//		System.out.println("점(x=" + x + ", y=" + y + ")를 지웠습니다.");
//	}
}

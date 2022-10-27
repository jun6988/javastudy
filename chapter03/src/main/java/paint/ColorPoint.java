package paint;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		// this 사용 x , private 때문에 접근을 못한다
		// 자식 생성자에서 반드시 부모 생성자 호출한다
//		setX(x);
//		setY(y);
		// 이게 더 멋지다
		super(x,y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// source - override 상속 받는 것
	@Override
	public void show() {
		System.out.println(
				"점(x=" + getX() + 
				", y=" + getY() +
				", color=" + color + // 자기꺼
				")를 그렸습니다."); // 부모가 private 이여서 get x y
	}
	
	
}

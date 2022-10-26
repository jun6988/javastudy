package paint;

public class ColorPoint extends Point {
	private String color;

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

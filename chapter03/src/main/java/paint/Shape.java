package paint;

public abstract class Shape { // abstract : main에서 new로 인스턴스 만들 수 없다
	private String lineColor;
	private String fillcolor;
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}
	
	public abstract void draw();
}

package tv; // test하려고 메인 만드는 것

public class TV {
	private int channel; // 1~255 사이 값을 가지게 하고 max, min 넘어 갈 시 라운딩 시킬 것
	private int volume;	 // 0~100 사이 값을 가지게 하고 max, min 넘어 갈 시 라운딩 시킬 것
	private boolean power;

	public void status() {
		System.out.println(
				"TV[channel=" + channel + 
				", volume=" + volume + 
				", power=" + (power ? "ON" : "OFF") + "]");
	}



}

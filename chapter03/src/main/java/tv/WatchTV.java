package tv;

public class WatchTV { // 오버로드 연습

	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false);

		tv.status();

		tv.power(true);
		tv.volume(120); // -1 되면 100되게
		tv.status();

		tv.volume(false); // 100
		tv.status();

		// 라운딩
		tv.channel(0);
		tv.status();

		// 라운딩 오바라이딩 (코드 중복이면 고쳐야한다)
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);

		tv.status();

		tv.power(false);

		tv.status();

	}

}

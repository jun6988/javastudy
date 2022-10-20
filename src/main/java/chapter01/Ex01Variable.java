package chapter01;

public class Ex01Variable {

	public static void main(String[] args) {
		int i = 1000;
		String s = "Hello World";
		
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("변수 변경(algorithm, logic)");
		i = 2000;
		s = "Hello Again";
		
		System.out.println(i);
		System.out.println(s);
		
		// 상수(관례상 대문자로 사용)
		final double PI = 3.14;
		System.out.println(PI);
		
		// 오류
		// final이 붙은 변수(상수)는 다시 값을 대입하면 오류
		
				
		
	}

}

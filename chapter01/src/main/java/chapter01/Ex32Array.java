package chapter01;

public class Ex32Array {

	public static void main(String[] args) {
		// 선언 시 크기를 지정할 수 없다.
		// int[10] a1;
		
		// 비추
		int a2[] = new int[5];
		System.out.println(a2.length);
		
		// 추천
		int[] a3 = new int[5];
		System.out.println(a3.length);
		
		// 초기화1**
		int[] a4 = {0, 1, 2, 3, 4};
		
		// 초기화2*** (추천)
		int[] a5 = new int[5];
		a5[0] = 0;
		a5[1] = 1;
		a5[2] = 2;
		a5[3] = 3;
		a5[4] = 4;
		System.out.println(a5.length);
		
		// 초기화3
		int[] a6 = new int[]{0, 1, 2, 3, 4};
		System.out.println(a6.length);

	}

}

package chapter01;

public class Ex26Continue {

	public static void main(String[] args) {
		for(int i =0; i < 20; i++) {
//			if(i % 2 != 0) {
//				System.out.println();
//			}
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}

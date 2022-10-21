package chapter01;

public class Ex30Gugudan2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + j*i);
				System.out.print("\t");
			}
			
			System.out.println("");
		}
	}

}
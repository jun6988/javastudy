package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int a =0;
		for(int i = 1; i < 10; i++) {
			for(int j = (1 + a); j <= (10 + a); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			a += 1;
		}
		}
	}


package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
			/* 코드 작성 */
		int a = scanner.nextInt();
		int sum = 0;
		
		if(a % 2 == 1) {
			for(int i = 1; i <= a; i++) {
				if(i % 2 ==1) {
					sum = sum + i;
				}
			}
			System.out.println("결과 값 :" + sum);
		} else {
			for(int i = 1; i <= a; i++) {
				if(i % 2 ==0) {
					sum = sum + i;
				}
			}
			System.out.println("결과 값 :" + sum);
		}

		scanner.close();
	}
	
}
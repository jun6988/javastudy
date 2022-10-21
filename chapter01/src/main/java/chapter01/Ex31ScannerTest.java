package chapter01;

import java.util.Scanner; // new 뒤에 커서 두고 ctrl shift o (자동 import)

public class Ex31ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		// 정수 입력 뱓기
		System.out.println("상품 정보를 입력 하세요. ");
		
		System.out.println("이름:");
		String name = scanner.next();
		
		System.out.println("가격");
		int price = scanner.nextInt();
		
		System.out.println("재고량");
		int countStock = scanner.nextInt();
		
		System.out.println(name + ":" + price + ":" + countStock);
		
		scanner.close();
	}

}

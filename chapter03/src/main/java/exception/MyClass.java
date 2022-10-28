package exception;

import java.io.IOException;

public class MyClass { // 파일이 없어서 code2가 실행이 안될 때 // throws throw 구분 잘 할 것
	public void danger() throws MyException {
		System.out.println("some code1");
		
		if(1 -1 == 0) {
			throw new MyException(); // 코드가 여기서 끝나고 code 2 실행 x
		}
		System.out.println("some code2");
	}
}

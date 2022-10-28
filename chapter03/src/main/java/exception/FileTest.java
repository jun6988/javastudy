package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// finally 외부블락이여서 밖에다 선언해줘야한다.
		FileInputStream fis = null;
		// stream 추상 단어 : 네트워크 관을 통해 byte가 흘러간다
		// 전체 코드를 try에 다 넣고 catch를 마지막에 열거해줘라 
		try {
			fis = new FileInputStream("hello.txt");
			// try catch 안하면 컴파일이 안되서 강제 해주는 것
			int data = fis.read();
			System.out.println((char)data);
			// hello.txt 만들고 char data
			
		} catch (FileNotFoundException e) {
			System.out.println("error:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			// fis.close(); // 외부 블록에서는 fis 찾을 수 없다.
			try {
				if(fis != null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

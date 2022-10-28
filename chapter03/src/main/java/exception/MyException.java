package exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L; // MyClass if문에 내용 넣어야 할 때
	public MyException(String message) {
		super(message);
	}
	// ㅡmessage 안넣고 싶을때 생성자 overload
	public MyException() {
		super("MyException thrown");
	}
}

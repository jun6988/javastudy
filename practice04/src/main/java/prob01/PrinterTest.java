package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
// println을 overload 하는 sysout
		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
	}
}
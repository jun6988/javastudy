package prob4;

public class SoundTest {
// soundable interface 구현하는 클래스에 interface method override
	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	private static void printSound( Soundable soundable ) {
		System.out.println( soundable.sound() );
	}
}
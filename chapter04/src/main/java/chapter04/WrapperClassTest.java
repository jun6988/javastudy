package chapter04;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		
		// Auto Boxing
		Integer i2 = 10;
		Long l = 10L;
		
		System.out.println(i2.equals(10)); // auto boxing
		
		// Auto Unboxing
		System.out.println(i2 == 10);
		// System.out.println(i2.intValue() == 10);
		int m = i2 + 10;
		// int m = i2.intValue() + 10;
		

	}

}

package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
//		getClass		
//		Class kclass = p.getClass();
//		System.out.println(kclass);
		
		System.out.println(p.getClass()); // reflection : 객체의 정보를 알아내서 하는 것
		System.out.println(p.hashCode()); // address 기반의 해싱값, address x, reference x
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
		System.out.println(p);
		
		
	}

}

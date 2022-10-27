package prob05;

public class Prob05 {

	public static void main(String[] args) {
		Base base = new MyBase(); //base mybase에 상속 mybase(자식 - 지지고 볶아서) 에서 base(부모 - 변하게하라) overriding

		base.service("낮");
		base.service("밤");
		base.service("오후"); 
	}
}

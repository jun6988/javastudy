package chapter03;

public class Goods {
	String name;
	int price;
	int countStock;
	int countSold;
	
	// source - generate to string 해야 GoodsApp에서 출력 가능 / 하지 않으면 해시 값이 출력된다
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	
	
	
}

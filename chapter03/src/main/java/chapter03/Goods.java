package chapter03;

public class Goods {
	public static int countOfGoods = 0;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
//	기본 생성자 생성하면 나오는 것
//	public Goods(int price) {
//		
//	}

	public Goods() {
		countOfGoods++;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getCountStock() {
		return countStock;
	}




	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}




	public int getCountSold() {
		return countSold;
	}




	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}




	// source - generate to string 해야 GoodsApp에서 출력 가능 / 하지 않으면 해시 값이 출력된다
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	
	
	
}

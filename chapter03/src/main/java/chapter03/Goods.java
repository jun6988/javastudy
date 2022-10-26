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
		
		// somecodes 중복
		countOfGoods++;
	}
	
	// 기본 생성자
	// 생성자 
	// 다형성
	// 오버로딩 (하나의 클래스에서 나타난다)
	// 생성자 오버로딩
	// 시그너쳐들을 다양하게 해서 다양하게 객체를 생성 (String name ,,,)
	public Goods(String name, int price, int countStock, int countSold) {
		// refactoring
		// somecodes 중복(countofgoods) > this(); 사용
		this();
		
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
		
		// 중복
	
		
//		countOfGoods++;
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
		if(price < 0) {
			price = 0;
		}
		
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





	public void showInfo() {
		System.out.println("Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold+ "]");
		
	}





	public int calcDiscountPrice(double discountRate) {
		return (int)(price * discountRate);
	}




	// source - generate to string 해야 GoodsApp에서 출력 가능 / 하지 않으면 해시 값이 출력된다
//	@Override
//	public String toString() {
//		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
//				+ "]";
//	}
	
	
	
	
	
	
	
}

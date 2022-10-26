package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		camera.showInfo(); // syso(camera);랑 동일
		
		int discountPrice = camera.calcDiscountPrice(0.5);
		System.out.println("Discount Price:" + discountPrice);
		
		//System.out.println(camera); // 해싱 출력 (Goods에서 변경해줘야함)
		
		
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		Goods g3 = new Goods();
		
		System.out.println("instance count:" + Goods.countOfGoods);
		
		Goods g4 = new Goods("TV", 10000, 10, 0);
		g4.showInfo();
		System.out.println("instance count:" + Goods.countOfGoods);
		
	}

}

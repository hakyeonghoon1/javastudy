package chapter03;

public class GoodsApp {

	   public static void main(String[] args) {
	      
	      Goods goods = new Goods();
	      goods.setName("nikon");
	      goods.setPrice(400000);
	      goods.setCountStock(10);
	      goods.setCountSold(20);
	      
	      goods.showInfo();
	      
	   }

}
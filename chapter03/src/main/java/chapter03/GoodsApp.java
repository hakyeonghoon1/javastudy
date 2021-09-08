package chapter03;

public class GoodsApp {

	   public static void main(String[] args) {
	      
	      Goods goods = new Goods();
	      goods.setName("nikon");
	      goods.setPrice(400000);
	      goods.setCountStock(10);
	      goods.setCountSold(20);
	      int discountPrice = goods.calcDiscountPrice(50);
	      
	      System.out.println(discountPrice);
	      
	      goods.showInfo();
	      System.out.println(Goods.countOfGoods);
	      
	      Goods goods2 = new Goods();
	      Goods goods3 = new Goods();
	      System.out.println(Goods.countOfGoods);
	      
	      
	      String s = "콜라 1000 20";
	      String[] tokens = s.split(" ");
	      for(String o : tokens) {
	    	  System.out.println(o);
	      }
	   }

}
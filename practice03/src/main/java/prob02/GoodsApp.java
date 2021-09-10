package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		
		for(int i=0;i<COUNT_GOODS;i++) {
			goods[i] =new Goods();
		}
		
		
		for(int i=0;i<COUNT_GOODS;i++) {
			
			String getItem = scanner.nextLine();
			String[] good = getItem.split(" ");
			//System.out.println(getItem);
			//System.out.println(good.length);
			
//			System.out.println(good[0]);
//			System.out.println(good[1]);
//			System.out.println(good[2]);
		
			goods[i].setName(good[0]);
			goods[i].setPrice(Integer.parseInt(good[1]));
			goods[i].setQty(Integer.parseInt(good[2]));
		
		}
		
		// 상품 출력
		for(int i=0;i<COUNT_GOODS;i++) {
			System.out.println(goods[i].getName()+"(가격:"+goods[i].getPrice()+"원)이 "+ goods[i].getQty()+"개 입고 되었습니다.");
		}
		// 자원정리
		scanner.close();
	}
}

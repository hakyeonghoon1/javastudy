package prob01;

import java.util.Arrays;
import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		int getMoney = scanner.nextInt();
		
		for(int i=0; i<MONEYS.length;i++) {
			int cnt = (getMoney/MONEYS[i]);
			getMoney = getMoney - (getMoney/MONEYS[i])*MONEYS[i];
			System.out.println(Integer.toString(MONEYS[i])+"원 : " +cnt+"개");
		}
		
		scanner.close();
 	}
}
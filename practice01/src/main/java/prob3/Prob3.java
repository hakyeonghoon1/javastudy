package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
				
		/* 코드 작성 */
		
		int getNum = scanner.nextInt();
		if(getNum%2==0) {
			int result = 0;
			for(int i=0;i<=getNum;i++) {
				if(i%2==0) {
					result += i;
				}
			}
			System.out.println("결과값은 : " + result);
		}
		else {
			int result = 0;
			for(int i=0;i<=getNum;i++) {
				if(i%2==1) {
					result += i;
				}
			}
			System.out.println("결과값은 : " + result);
		}
		
		scanner.close();
		
	}
}

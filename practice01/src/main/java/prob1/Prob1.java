package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요 : ");
		Scanner scanner = new Scanner( System.in );
		int getNum = scanner.nextInt();
		/* 코드 작성 */
		if(getNum%3 ==0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			
			System.out.println("3의 배수가 아닙니다.");
		}
		
		scanner.close();
	}
}

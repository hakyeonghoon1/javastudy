package exception;

public class ExceptioinTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 /*- a*/;
		
		System.out.println("some code1");
		try {
			System.out.println("some code2");
			int result = (1 + 2+ 3)/b;
			System.out.println("some code3");
			System.out.println("some code4");
		} catch(ArithmeticException e) {
			/* 예외 처리 */
			// 1.사과
			System.out.println("죄송합니다.");
			// 2.로킹
			System.out.println("error : "+e);
			// 3.정상종료 
			return;			
		} finally {
			System.out.println("자원 정리");
		}
		//System.out.println("some code4"); try/catch 할 때 finally 밑에 코딩 하지 않는다
	}

}

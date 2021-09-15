package prob05;

@SuppressWarnings("serial")
public class PasswordDismatchException extends RuntimeException{
	public PasswordDismatchException() {
		System.out.println("사용자를 찾을 수 없습니다.");
	}
}

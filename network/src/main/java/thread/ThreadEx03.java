package thread;

public class ThreadEx03 {
	public static void main(String[] args) {
		Thread thread1 = new DigitThread();
		Thread thread2 = new AlphabetThread();
		Thread thread3 = new Thread(new UpperCaseAlphabetRunnableImpl()); //쓰레드를 상속받지 못할 경우 (클래스 수정 안될 때)
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

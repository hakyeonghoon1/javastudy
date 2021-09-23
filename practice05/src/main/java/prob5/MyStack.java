package prob5;

public class MyStack {
	
	private String[] strA;
	private int num;
	
	public MyStack(int a) {
		this.strA = new String[a];
		this.num = -1;
	}
	public void push(String str) {
		this.strA[++num] = str;
		
	}
	public boolean isEmpty() {
		return false;
	}
	public String pop() throws MyStackException {
		if(num==-1) {
			throw new MyStackException();
		}
		return this.strA[num--];
		
	}
	
}
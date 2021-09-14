package prob01;

public class Printer {
/*
	public void println(Object object) {
		
		System.out.println(object);
	}
*/
	public <T> void println(T t) {
		System.out.println(t);
	}
	
	public <T> void println(T... ts) {
		for(T ta:ts) {
			System.out.println(ta);
		}
	}
	
	public int sum(Integer... nums) {
		int sum=0;
		for(Integer i:nums) {
			sum+=i;
		}
		return sum;
	}
}

package chapter03;

public class SwapTest01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a+":" + b);
		
		/*swap 하기*/
		int c=0;
		c=a;
		a=b;
		b=c;
		
		System.out.println(a+":"+b);

	}

}

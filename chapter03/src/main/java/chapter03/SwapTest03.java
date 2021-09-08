package chapter03;

public class SwapTest03 {


	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);
		
		System.out.println(a.val+":" + b.val);
		
		/*swap 하기*/
		swap(a,b);

		System.out.println(a.val+":"+b.val);

	}
	
	public static void swap(Value p,Value q) {
		int temp=p.val;
		p.val=q.val;
		q.val=temp;
	}

}

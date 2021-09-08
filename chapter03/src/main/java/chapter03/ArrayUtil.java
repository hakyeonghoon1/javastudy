package chapter03;

public class ArrayUtil {

	
	public static double[] intToDouble(int[] arr) {
		double[] a= new double[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i] = (double)arr[i];
		}
		
		return a; 
	}
}

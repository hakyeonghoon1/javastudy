package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			int cnt=0;
			for(int j=0;j<Integer.toString(i).length();j++) {
				if(Integer.toString(i).contains("3")||Integer.toString(i).contains("6")||Integer.toString(i).contains("9")) {
					cnt +=1;
					System.out.println("");
					System.out.print(Integer.toString(i).substring(0)+" ");
					for(int k=0;k<cnt;k++) {
						System.out.print("짝");
					}
					//cnt +=1;
					//System.out.println();
					//System.out.println(i);
					//for(int k=0;k<cnt;k++) {
					//	System.out.print("짝");
					//}
				}
			}
			
		}
	}
}

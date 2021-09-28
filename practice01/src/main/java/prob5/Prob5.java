package prob5;

public class Prob5 {

	public static void main(String[] args) {

		for(int i=1;i<=99;i++) {
			
			String a = Integer.toString(i);
			if(a.contains("3")||a.contains("6")||a.contains("9")) {
				
				System.out.print(i+" ");
				
				for(int j=0;j<a.length();j++) {
					if(a.substring(j,j+1).contains("3")||a.substring(j,j+1).contains("6")||a.substring(j,j+1).contains("9")) {
						System.out.print("짝");
						
					}
				}
				System.out.println("");
				
			}
		}
	}
}

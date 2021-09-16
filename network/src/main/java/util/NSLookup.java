package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		
		/*
		 * >www.douzone.com
		 * 205.421.123.
		 * >naver.com
		 * 202'203
		 * 202
		 * quit
		 */
		//String line = "www.douzone.com";
		Scanner scanner = null;
		try {
			while(true) {
				System.out.print("홈페이지 주소 입력>>");
				scanner =new Scanner(System.in);
				String line2 = scanner.nextLine();
				InetAddress[] inetAddresses =InetAddress.getAllByName(line2);
			
				for(int i=0;i<inetAddresses.length;i++) {
					System.out.println(inetAddresses[i]);
				}
				if(line2.equals("quit")) {
					break;
				}
			}
		} catch (UnknownHostException e) {
			System.out.println("UnKnownHost : "+e);
		} finally {
			scanner.close();
		}
	}

}

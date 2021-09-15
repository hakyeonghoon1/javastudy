package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

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
		String line = "www.douzone.com";
		
		try {
			InetAddress[] inetAddresses =InetAddress.getAllByName(line);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

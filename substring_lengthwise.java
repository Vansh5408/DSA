package lecture23;

import java.util.Scanner;

public class substring_lengthwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ans(s);
		

	}
	public static void ans (String s ) {
		for(int length =1;length<=s.length();length++) {
			for(int j = length;j<=s.length();j++) {
				int i =j-length;
				System.out.println(s.substring(i,j));
			}
		}
	}

}

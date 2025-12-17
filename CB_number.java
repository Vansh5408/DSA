package lecture23;

import java.util.Scanner;

public class CB_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(ans(s));
	}
	public static int ans(String s) {
		int count =0;
		for(int length =1;length<=s.length();length++) {
			for(int j=length;j<s.length();j++) {
				int i = j-length;
				String s1 =s.substring(i,j);
				long a = Long.parseLong(s1);
				if(iscb(a)==true && isvalid(a)) {
					count++;
				}
			}
		}
		return count;
	}
	public static boolean isvalid(long a) {
		
		return false;
	}
	public static boolean iscb(long a) {
		if(a==0 || a==1) {
			return false;
		}
		int []arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(a==arr[i]) {
				return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(a%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}

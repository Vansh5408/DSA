package lecture11;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ans(n));

	}
	public static boolean ans(int n) {
		int c = count(n);
		int sum =0;
		int p=n;
		while(n>0) {
			int rem =n%10;
			sum = (int)(sum+Math.pow(rem,c));
			n=n/10;
		}
		if(sum==p) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int count(int n) {
		int c =0;
		while(n>0) {
			c++;
			n=n/10;
		}
		return c;
	}

}

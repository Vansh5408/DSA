package lecture20;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW_spoj_google {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		int n= sc.nextInt();
		int c = sc.nextInt();
		int []stall = new int [n];
		for(int i=0;i<stall.length;i++) {
			stall[i]=sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(cow(stall,c));
		}
		
	}
	public static int cow(int[]stall,int c) {
		int ans =0;
		int l=stall[0];
		int r=stall[stall.length-1];
		while(l<=r) {
			int mid = (l+r)/2;
			if(ispossible(stall,c,mid)==true) {
				ans =mid;
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return ans;
	}
	public static boolean ispossible(int[] stall, int c, int mid) {
		int a= stall[0];
		int count =1;
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-a>=mid) {
				count++;
				a=stall[i];
			}
			if(c==count) {
				return true;
			}
		}
		return false;
	}
	

}

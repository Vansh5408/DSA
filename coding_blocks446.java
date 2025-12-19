package lecture25;

import java.util.Scanner;

public class coding_blocks446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s= sc.next();
		int ans =count(n,s,'a');
		int ans1=count(n,s,'b');
		System.out.print(Math.max(ans,ans1));

	}
	public static int count(int n,String a,char ch){
		int flip=0;
		int e=0;
		int s=0;
		int ans =0;
		while(e<a.length()){
			if(a.charAt(e)==ch){
				flip++;
			}
			if(flip>n && e>=s){
				if(a.charAt(s)==ch){
					flip--;
				}
				s++;
			}
			ans=Math.max(ans,(e-s)+1);
			e++;
		}
		return ans;
	}

}

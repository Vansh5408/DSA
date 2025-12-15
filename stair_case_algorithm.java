package lecture18and19;

import java.util.Scanner;

public class stair_case_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][]arr = new int [m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr [i][j]=sc.nextInt();
			}
		}
		int target = sc.nextInt();
		int c=arr[0].length-1;
		int r=0;
		boolean flag =false;
		while(r<arr.length && c>=0) {
			if(arr[r][c]==target) {
				flag=true;
				break;
			}
			else if(arr[r][c]<target) {
				r++;
			}
			else {
				c--;
			}
		}
		System.out.println(flag);
		
	}

}

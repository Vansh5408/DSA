package lecture18and19;

import java.util.Scanner;

public class spiral_2d_array {

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
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int count =0;
		int total=arr.length*arr[0].length;
		while(count<total) {
			
			for(int i=minc ; i<=maxc && count<total;i++) {
				count++;
				System.out.print(arr[minr][i]+",");
			}
			minr++;
			
			for(int i=minr ; i<=maxr && count<total;i++) {
				count++;
				System.out.print(arr[i][maxc]+",");
			}
			maxc--;;
			
			for(int i=maxc ; i>=minc && count<total;i--) {
				count++;
				System.out.print(arr[maxr][i]+",");
			}
			maxr--;
			
			for(int i=maxr ; i>=minr && count<total;i--) {
				count++;
				System.out.print(arr[i][minc]+",");
			}
			minc++;
			
		}
	}

}

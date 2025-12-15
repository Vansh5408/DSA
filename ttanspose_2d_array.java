package lecture18and19;

import java.util.Scanner;

public class ttanspose_2d_array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][]arr = new int [m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr [i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(arr[j][i]+"  ");
//			}
//			System.out.println();
//		}

		
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<n;j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]);
			}
		System.out.println();
	}
	}
}

package lecture18and19;

import java.util.Scanner;

public class column_print_2d_array {

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
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<m;j++) {
					System.out.print(arr[j][i]+"  ");
				}
				System.out.println();
			}
			else {
				for(int j=m-1;j>=0;j--) {
					System.out.print(arr[j][i]+"  ");
				}
				System.out.println();
			}
		}

	}

}

package lecture24;

import java.util.ArrayList;
import java.util.Collections;

public class add_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {9,9,9,9};
		int []arr2= {9,9,9,9,9};
		add(arr1,arr2);

	}
	public static void add(int[]arr1, int []arr2) {
		ArrayList<Integer>l= new ArrayList<>();
		int i=arr1.length-1;
		int j= arr2.length-1;
		int c=0;
		while(i>=0 && j>=0) {
			int sum = arr1[i]+arr2[j]+c;
			int ans =sum%10;
			c=sum/10;
			l.add(ans);
			i--;
			j--;
		}
		while(i>=0) {
			int sum =arr1[i]+c;
			int ans =sum%10;
			c=sum/10;
			l.add(ans);
			i--;
		}
		while(j>=0) {
			int sum =arr2[j]+c;
			int ans =sum%10;
			c=sum/10;
			l.add(ans);
			j--;
		}
		if(c>0) {
			l.add(c);
		}
		Collections.reverse(l);
		System.out.println(l);
		
	}

}

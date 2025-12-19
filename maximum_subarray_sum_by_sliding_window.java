package lecture25;

public class maximum_subarray_sum_by_sliding_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {9,8,7,6,5,4,3,2,1};
		int k=3;
		System.out.println(slidingWindow(arr,k));

	}

	public  static int  slidingWindow(int[] arr, int k) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int temp = sum ;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			temp = Math.max(sum,temp);
		}
		return temp;
	}

}

package lecture27;

public class find_element_recursion {

	public static void main(String[] args) {
		int []arr = {2,3,4,5,6,7,8,9,3,4,5};
		int target = 2;
		System.out.println(ans(arr,arr.length-1,target));	

	}

	public static int ans(int[] arr, int i, int target) {
		// TODO Auto-generated method stub
		if(i==-1) return -1;
		if(arr[i]==target) return i;
		return ans(arr,i-1,target);
	}

}

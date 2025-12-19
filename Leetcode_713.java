package lecture25;

public class Leetcode_713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8,9};
		int k=10;
		System.out.print(count(arr,k));
	}

       public  static int  count(int[] arr, int k) {
		// TODO Auto-generated method stub
    	   int s=0;
    	   int e=0;
    	   int p=1;
    	   int ans =0;
    	   while(e<arr.length) {
    		   p*=arr[e];
    		   if(p>=k && s<=e) {
    			   p/=arr[s];
    			   s++;
    		   }
    		   ans+=e-s+1;
    		   e++;
    	   }
		return ans;
	}

}

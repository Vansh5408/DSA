package lecture11;

public class Array_swap {
    public static void main(String[]args) {
	int []arr = {10,20,30,40,50};
	swap(arr,0,1);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
   }
    public static void swap(int[] arr,int a,int b) {
    	int temp= arr[a];
    	arr[a]=arr[b];
    	arr[b]=temp;
    }
}

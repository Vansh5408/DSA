package lecture14;

public class Insertion_sort {
	public static void main(String[]args) {
		int []arr = {5,3,-7,4,8,2};
		sort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void sort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			int a  = arr[i];
			int j =i-1;
			while(j>=0 && arr[j]>a) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=a;
		}
	}
}
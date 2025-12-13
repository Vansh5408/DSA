package lecture14;

public class Selection_sort {

	public static void main(String[] args) {
		int []arr  = {5,3,-7,4,8,2};
		sort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}

	}
	public static void sort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int a = i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[j]<arr[a]) {
					a=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[a];
			arr[a]=temp;
			
		}
	}

}

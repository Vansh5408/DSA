package lecture17;

public class kth_root_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87;
		int temp=n;
		int k = 3;
		n=n/(k*k);
		int l=1;
		int r=n;
		int ans =0;
		while(l<=r) {
			int mid =(l+r)/2;
			if(Math.pow(mid, k)<=temp) {
				ans =mid;
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		System.out.println(ans);
		
	}

}

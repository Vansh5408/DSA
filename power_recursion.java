package lecture26;

public class power_recursion {

	public static void main(String[] args) {
		int n =2;
		int k=2;
		System.out.print(Power(n,k));

	}
	public static int Power(int n , int x) {
		if(x==1) {
			return n;
		}
		int ans =Power(n,x-1);
		return n*ans;
		
	}

}

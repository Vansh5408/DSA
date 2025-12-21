package lecture26;

public class Fact_by_recursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.print(fact(n));

	}
	public static int fact(int n ) {
		if(n==1) {
			return 1;
		}
		int ans = n*fact(n-1);
		return ans;
	}

}

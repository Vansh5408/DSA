package lecture64;

public class fibonacci_dp_top_down {

	public static void main(String[] args) {
		int n =8;
		int []dp = new int [n+1];
		System.out.println(fibdp(n,dp));
		System.out.println(fibBU(n));
	}
	public static int fibdp(int n,int[]dp) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		return dp[n]=fibdp(n-1,dp)+fibdp(n-2,dp);
	}
	  
	
	public static int fibBU(int n) {
		int []dp = new int [n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

}

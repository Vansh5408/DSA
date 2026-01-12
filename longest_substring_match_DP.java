package lecture65;
import java.util.Arrays;
public class longest_substring_match_DP {

	public static void main(String[] args) {
		String s1= "abcde";
		String s2 = "ace";
		int [][]dp = new int[s1.length()][s2.length()];
		for(int i=0;i<s1.length();i++) {
			for(int j= 0; j<s2.length();j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(lcs(s1,s2,0,0,dp));

	}
	public static int lcs(String s1 , String s2 ,int i, int j,int[][]dp) {
		if(s1.length()==i || s2.length()==j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans =0;
		if(s1.charAt(i)==s2.charAt(j)){
			ans=1+lcs(s1,s2,i+1,j+1,dp);
		}
		else {
			int a= lcs(s1,s2,i+1,j,dp);
			int b =lcs(s1,s2,i,j+1,dp);
			ans = Math.max(a, b);
		}
		return dp[i][j]=ans;
	}

}

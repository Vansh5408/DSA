package lecture29;

public class valid_parenthasis {

	public static void main(String[] args) {
		int n =3;
		parenthesis(0,0,n,"");

	}

	public static void parenthesis(int i, int j, int n, String ans) {
		// TODO Auto-generated method stub
		if(i==n && j==n) {
			System.out.print(ans+" ");
			return;
		}
		if(i<n) {
			parenthesis(i+1,j,n,ans+"(");
		}
		if(j<i) {
			parenthesis(i,j+1,n,ans+")");
		}
	}

}

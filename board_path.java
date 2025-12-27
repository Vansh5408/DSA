package lecture28;

public class board_path {

	public static void main(String[] args) {
		int n =6;
		board(n,0,"");

	}

	public static void board(int n, int curr, String ans) {
		if(curr==n) {
			System.out.print(ans+" ");
			return;
		}
		if(curr>n) {
			return;
		}
		for(int i=1;i<=6;i++) {
			board(n,curr+i,ans+i);
		}
		
	}

}

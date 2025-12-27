package lecture28;

public class coins_no2H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		print(n,"");

	}
	public static void print(int n ,String ans ) {
		if(n==0) {
			System.out.print(ans+" ");
			return;
		}
		if( ans.length()==0 ||ans.charAt(ans.length()-1)!='H') {
			print(n-1,ans+"H");
		}
		print(n-1,ans+"T");
	}

}

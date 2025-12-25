package lecture27;

public class subsequence_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		ans(s,"");

	}
	public static void ans(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch =s.charAt(0);
		ans(s.substring(1),ans);
		ans(s.substring(1),ans+ch);
		
	}

}

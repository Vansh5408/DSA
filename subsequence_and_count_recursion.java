package lecture28;

public class subsequence_and_count_recursion {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println("\n"+ ""+ans(s,""));

	}
	public static int ans(String s,String s1) {
		if(s.length()==0) {
			System.out.print(s1+" ");
			return 1;
		}
		char ch =s.charAt(0);
		int b1 =ans(s.substring(1),s1+ch);
		int a1 =ans(s.substring(1),s1);
		
		return a1+b1;
	}

}

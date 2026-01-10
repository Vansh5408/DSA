package lecture31;

public class tower_of_honai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 10 ;
		print(n,"A","B","C");

	}

	public  static void print(int n, String src, String hlp, String des) {
		if(n==0) {
			return;
		}
		print(n-1,src,des,hlp);
		System.out.println("move "+n+" th from "+src+" to "+des);
		print(n-1,hlp,src,des);
		
	}

}

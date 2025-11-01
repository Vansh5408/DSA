package lecture10;

public class Func1 {
	public static void main(String[]args) {
		System.out.println("hey");
		int a = 9;
		int b = 8;
		int ans = add(a,b);
		System.out.println(ans);
	}
	public static int add(int x, int y) {
		//int i=10;
	//	int j=15;
		int ans = x+y;
		 int ans1 =sub(x,y);
		 System.out.println(ans1);
		return ans;
	}
	public static int sub(int r , int t) {
		int ans  = r-t;
		return ans;
	}

}

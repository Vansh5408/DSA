package lecture27;

public class fibonnacci_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fibo(n));
	}
	public static int fibo(int n) {
		if(n==0 || n==1) return n;
		return fibo(n-2)+fibo(n-1);
	}

}

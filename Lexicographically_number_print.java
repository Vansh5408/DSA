package lecture31;

public class Lexicographically_number_print {

	public static void main(String[] args) {
		int n =1000;
		print(0,1000);
		System.out.println(c);

	}
	static int c=0;
	public static void print(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		c++;
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			print(curr*10+i,n);
		}
		
	}

}

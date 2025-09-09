package lecture42;

import java.util.Stack;

public class stackReverse {

	public static void main(String[] args) {
		Stack<Integer>st = new Stack<>();
		for(int i=1;i<5;i++) {
			st.push(i*10);
		}
		reverse(st);
		System.out.println(st);
	}
	public static void reverse(Stack<Integer>st) {
		if(st.isEmpty()) {
			return;
		}
		int a= st.pop();
		reverse(st);
		Insert_bottom(st,a);
	}
	public  static void Insert_bottom(Stack<Integer> st, int a) {
		if(st.isEmpty()) {
			st.push(a);
			return;
		}
		int ii= st.pop();
		Insert_bottom(st,a);
		st.push(ii);
		
	}

}

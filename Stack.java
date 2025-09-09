package lecture42;

public class Stack {
	
	private int[]arr;
	private int i=-1;
	
	public Stack() {
		arr = new int [5];
	}
	public Stack(int n) {
		arr= new int [n];
	}
	public boolean isEmpty() {
		return i==-1;
	}
	public boolean isFull() {
		return i==arr.length-1;
	}
	public void push1(int item) {
		if(isFull()) {
			return;
		}
		i++;
		arr[i]=item;
	}
	public int pop() {
		int item=arr[i];
		i--;
		return item;
	}
	public int peek() {
		return arr[i];
	}
	public void display() {
		for(int j=0;j<=i;j++) {
			System.out.println(arr[j]);
		}
	}
	

	public static void main(String[] args) {
		Stack st =new Stack(5);
		st.push1(10);
		st.push1(20);
		st.push1(30);
		st.push1(40);
		st.pop();
		st.pop();
		st.display();
		System.out.println(st.peek());
	}

}

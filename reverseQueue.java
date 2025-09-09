package lecture42;

public class reverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue qt = new Queue();
		for(int i=1;i<5;i++) {
			qt.Enqueue(i*10);
		}
		qt.display();
		reverse(qt);
		qt.display();

	}
	public static void reverse(Queue qt) {
		if(qt.isEmpty()) {
			return;
		}
		int a= qt.Dequeue();
		reverse(qt);
		qt.Enqueue(a);
	}

}

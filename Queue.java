package lecture42;

public class Queue {
	private int []arr;
	private int start=0;
	private int size=0;
	
	public Queue() {
		arr=new int[5];
	}
	public Queue(int n) {
		arr=new int [n];
	}
	
	public boolean isEmpty() {
		return start==0;
	}
	public boolean isFull() {
		return start==arr.length;
	}
	public void Enqueue(int item) {
		if(isFull()) {
			return;
		}
		int i=(start+size)%arr.length;
		arr[i]=item;
		start++;
	}
	public int Dequeue() {
		if(isEmpty()) {
			return -1;
		}
		int rv =arr[size];
		size=(size+1)%arr.length;
		start--;
		return rv;
	}
	public void display() {
		for(int i=0;i<start;i++) {
			int a= (size+i)%arr.length;
			System.out.println(arr[a]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue qt = new Queue(5);
		qt.Enqueue(10);
		qt.Enqueue(20);
		qt.Enqueue(30);
		qt.Enqueue(40);
		qt.Enqueue(50);
		qt.Dequeue();
		qt.Dequeue();
		qt.Enqueue(60);
		qt.Enqueue(70);
		qt.display();
	}

}

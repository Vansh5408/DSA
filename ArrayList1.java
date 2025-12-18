package lecture24;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		for(int i : l1) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println();
		for(int i : l1) {
			System.out.print(i+" ");
		}
		
	}

}

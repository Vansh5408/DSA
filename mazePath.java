package lecture30;

public class mazePath {

	public static void main(String[] args) {
		int n =4;   // row
		int m=5;    //col
		System.out.println("total count is  "+""+printPath(0,0,n-1,m-1,""));
		
	}
         static int c=1;
	private static int printPath(int cr, int cc, int er, int ec, String ans) {
		// TODO Auto-generated method stub
		if(cr==er && cc==ec) {
			System.out.println(c+")  "+ans);
			c++;
			return 1;
		}
		if(cr>er || cc>ec) {
			return 0;
		}
		int f1= printPath(cr+1,cc,er,ec,ans+"V");
		int f2= printPath(cr,cc+1,er,ec,ans+"H");
		return f1+f2;
	}

}

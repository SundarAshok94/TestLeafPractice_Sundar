package JavaPractice;

public class Fibonacci {

	public static void main(String[] args) {
		int firstnum=0;
		int secnum=1;
		int n=10;
		for(int i=0;i<n;i++) {
			System.out.println(firstnum + "");
			
			int nextnum = firstnum + secnum;
			firstnum = secnum;
			secnum = nextnum;
			
		    }
			

	}

}

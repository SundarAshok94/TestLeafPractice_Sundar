package JavaPractice;

public class Primenumber {

	public static void main(String[] args) {

		int number=3;
		boolean isflag=true;
		for(int i=2;i<number;i++) {
			if(number==2)
			System.out.println("Prime number");
			
			
		
			else if(number%i==0)
			{
			
			isflag=false;
			}
		}
			if(isflag) {
			System.out.println("its prime number");
			}
			else {
				System.out.println("its not a prime number");}
			}
	}

		

	

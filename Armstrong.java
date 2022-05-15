package JavaPractice;

public class Armstrong {

	public static void main(String[] args) {


		int input=776;
		int sum=0;
		int original=input;


		while(input>0) {

			int Rem= input % 10;
			sum = sum +(Rem*Rem*Rem);
			input = input/10;

		}
		if(sum == original) {

			System.out.println("number is armstrong number");
		}
		else {

			System.out.println("not a armstrong number");
		}
	}}

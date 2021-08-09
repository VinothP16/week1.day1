package week1.day1;

public class LearnFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum = 9;
		int factorial = 1;
		int fact = 1;
		
		for (int i = 1; i <= inputNum; i++) {
			factorial = factorial * (fact * i) ;
		}
			 	 System.out.println("Factorial of " + factorial);

	}

}

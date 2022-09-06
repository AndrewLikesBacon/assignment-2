
public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibSequence(0, 1, n) + ".");
		
	}
	
	public static long fibSequence(long num1, long num2, int n) {
		
		if (n==1) {
			return 0;
		}
		if (n<3) {
			return num2;
		}
		return fibSequence(num2, num1+num2, n-1);
		
	}
}

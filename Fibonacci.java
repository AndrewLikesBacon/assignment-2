
public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibSequence(0, 1, n) + ".");
		
	}
	
	/**
	 * Returns the nth number in the Fibonacci sequence.
	 * The Fibonacci sequence starts with 0 and 1.
	 * Each number after is the sum of the previous 2.
	 * Example: 0,1,1,2,3,5,8,13,21,34,etc.
	 * 
	 * @author Andrew Anzalone
	 * @param num1 The first number of the two that will be added together to get the next number in the sequence.
	 * @param num2 The second number of the two that will be added together to get the next number in the sequence.
	 * @param n The nth number in the sequence to find.
	 * @return The nth number in the Fibonacci sequence.
	 */
	
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

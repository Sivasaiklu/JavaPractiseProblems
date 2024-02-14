package CRT;

public class program5 {
	public static void main(String[] args) {
		int largestPalindrome = calcLargePalindrome();
		System.out.println("The largest palindrome is: "+largestPalindrome);
	}
	
	public static int calcLargePalindrome() {
		int larger = 0;
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				int p = i* j;
				if(isPalindrome(p) && p > larger) {
					larger = p;
				}
			}
		}
		return larger;
	}
	
	public static Boolean isPalindrome(int digit) {
		String str = Integer.toString(digit);
		String rev = new StringBuilder(str).reverse().toString();
		return str.equals(rev);
	}

}

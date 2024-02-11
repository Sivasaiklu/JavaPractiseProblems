package CRT;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sai = new Scanner(System.in);
		long n = 600851475143L;
		long maxPrime = findMaxPrime(n);
		System.out.println("The larget prime factor is: "+maxPrime);

	sai.close();	
	}
	
	public static long findMaxPrime(long num) {
		long max = 0;
		HashSet<Long> hashset = new LinkedHashSet<>();
		for(long i=2;i<=num;i++) {
			while(num%i==0) {
				hashset.add(i);
				num=num/i;
			}
		}
		for(Long i : hashset) {
			if(max < i) {
				max=i;
			}
		}
		return max;
	}
}


/* second method
 * public static long secondMethod(long num) {
		long i=2;
		while(i*i <= num) {
			if(num%i !=0) {
				i++;
			}
			else {
				num=num/i;
			}
		}
		return num;
		
	}
*/
 



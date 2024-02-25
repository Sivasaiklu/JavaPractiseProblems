package CRT;

public class primeSum {
	public static void main(String[] args){
		long limit = 2000000 ;
		long res = calcPrimeSum(limit);
		System.out.println(res);
	}
	public static long calcPrimeSum(long n) {
		long sum=0;
		for(long i=2;i<=n;i++) {
			if(isPrime(i))
				sum+=i;
		}
		return sum;
	}
	public static Boolean isPrime(long n) {
		if(n==0 || n==1)
			return false;
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}

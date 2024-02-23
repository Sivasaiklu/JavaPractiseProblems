package CRT;

public class primePos {
	public static void main(String... args) {
		
		int result = findPrimePos();
		System.out.println(result);
		
	}
	public static int findPrimePos() {
		int count=0, num=1;
		while(true) {
			if(isPrime(num))
				count++;
			if(count == 10001)
				return num;
		num++;	
		}
		
	}
		
	public static Boolean isPrime(int n) {
		if(n==0 || n==1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}

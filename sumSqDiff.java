package CRT;

public class sumSqDiff {
	public static void main(String... args) {
		int sum1=0, sum2=0;
		for(int i=1;i<=100;i++) {
			sum1+=(i*i);
			sum2+=i;
		}
		int s = sum2*sum2;
		System.out.println(s - sum1);
	}

}


//the above program is taken from projecteular.net
// problem is Sum Square Difference
/* the aim of this problem is to calculate difference sum of squares of
 * first n natural numbers and squares of sum of natural numbers*/
 
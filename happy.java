package CRT;

import java.util.Scanner;

public class happy {
	public static void main(String[] args) {
		Scanner sai = new Scanner(System.in);
		int n = sai.nextInt();
		int ans = n;
		while(ans != 1 && ans != 4) {
			ans = isHappyNum(ans);
		}
		if( ans == 1)
			System.out.println("Happy Number");
		else
			System.out.println("Not a Happy Number");
	}
	public static int isHappyNum(int n) {
		int r=0, s=0;
		while( n > 0) {
			r = n%10;
			s+= (r*r);
			n =n/10;
		}
		return s;
	}

}

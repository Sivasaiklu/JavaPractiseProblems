package CRT;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner sai = new Scanner(System.in);
		int n = sai.nextInt();
		int t3 = (n-1)/3;
		int t5 = (n-1)/5;
		int t15 = (n-1)/15;
		int s3 = 3*(t3*(t3+1)/2);
		int s5 = 5*(t5*(t5+1)/2);
		int s15 = 15*(t15*(t15+1)/2);
		
		int s= s3+s5-s15;
		System.out.println(s);
		
	}

}

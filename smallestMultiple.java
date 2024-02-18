package CRT;

public class smallestMultiple {
	public static void main(String... args) {
		System.out.println(findSmallestMultiple());
	}
	
	public static long findSmallestMultiple() {
		boolean find = true;
		long answer = 0;
		for(long i = 2520; find; i++) {
			if(i % 11 !=0 || i % 12 !=0 || i % 13 !=0 || i % 14 !=0 || i % 15 !=0 || i % 16 !=0 || i % 17 !=0 || i % 18 !=0 || i % 19 !=0 || i % 20 !=0)
				continue;
			answer = i;
			find = false;
		}
		return answer;
	}

}

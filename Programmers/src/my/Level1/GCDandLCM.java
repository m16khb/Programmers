package my.Level1;

public class GCDandLCM {
	public static void main(String[] args) {
		GCDandLCM gal = new GCDandLCM();
	}
	
//	public int[] solution(int n, int m) {
//		int[] answer = {};
//		answer = new int[2];
//
//		if (n < m) {
//			int temp = n;
//			n = m;
//			m = temp;
//		}
//
//		for (int i = m; i >= 1; i++) {
//			if ((n % i == 0) && (m % i == 0)) {
//				answer[0] = i;
//				break;
//			}
//		}
//
//		for (int i = n; i <= 1000000; i++) {
//			if ((i % n == 0) && (i % m == 0)) {
//				answer[1] = i;
//				break;
//			}
//		}
//		
//		return answer;
//	}
	
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		if(m > n) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		answer[0] = gcd(n, m);
		answer[1] = (n * m) / answer[0];
		return answer;
	}

	public static int gcd(int n, int m) {
		if (m == 0)
			return n;
		return gcd(m, n % m);
	}
}

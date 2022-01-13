package my.Level1;

public class XdisNnum {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		XdisNnum s = new XdisNnum();
		s.solution(2, 5);
	}

	public long[] solution(int x, int n) {
		long[] answer = {};
		answer = new long[n];
		long sum = x;
		for (int i = 0; i < n; i++) {
			answer[i] = sum;
			sum += x;
		}
		return answer;
	}
}

package my.Level1;

public class IntegerDescArraange {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		IntegerDescArraange ida = new IntegerDescArraange();
		ida.solution(118372);
	}

	public long solution(long n) {
		long answer = 0;
		long num = n;
		int count = 0;
		while (num / 10 != 0) {
			num /= 10;
			count++;
		}

		long[] list = new long[count + 1];
		for (int i = 0; i < list.length; i++) {
			list[i] = n % 10;
			n /= 10;
		}

		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] < list[j]) {
					long temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}

		count = 0;
		for (int i = list.length - 1; i >= 0; i--) {
			answer += list[i] * Math.pow(10, count++);
		}

		return answer;
	}
}

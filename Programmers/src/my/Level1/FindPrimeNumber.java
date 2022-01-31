package my.Level1;

public class FindPrimeNumber {

	public static void main(String[] args) {
		FindPrimeNumber fpn = new FindPrimeNumber();
		System.out.println(fpn.solution(10));
	}

	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i < n + 1; i++) {
			if (isPrime(i)) {
				answer++;
			}
		}

		return answer;
	}

	public boolean isPrime(int n) {
		boolean flag = true;

		if (n == 1) {
			return false;
		}

		//효율성을 위해 n까지 계산하지 않고 sqrt(n)까지 계산
		//기억 해 놓으면 좋을 듯
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}
}

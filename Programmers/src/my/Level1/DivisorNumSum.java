package my.Level1;

public class DivisorNumSum {

	public static void main(String[] args) {
		DivisorNumSum dns = new DivisorNumSum();
		System.out.println(dns.solution(13, 17));
	}

	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i < right + 1; i++) {
			if (checkDivisorNumOdd(i))
				answer += i;
			else
				answer -= i;
		}

		return answer;
	}

	boolean checkDivisorNumOdd(int num) {
		boolean flag = true;
		int divisorNum = 0;
		for (int i = 1; i <= num; i++) {
			if(num % i == 0)
				divisorNum++;
		}
		
		if(divisorNum % 2 != 0)
			flag = false;

		// 짝수면 true 홀수면 false
		return flag;
	}
}

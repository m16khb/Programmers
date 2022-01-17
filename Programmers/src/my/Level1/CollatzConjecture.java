package my.Level1;

public class CollatzConjecture {
	public static void main(String[] args) {
		CollatzConjecture cc = new CollatzConjecture();
		System.out.println(cc.solution(626331));
	}
	public long solution(long num) {
		//문제 오류 int를 long으로 바꿔야됨
		long answer = 0;
		while (num != 1) {
			if(answer == 500)
				return -1;
			if (num % 2 == 0)
				num /= 2;
			else
				num = (num * 3 + 1);
			answer++;
		}

		return answer;
	}
}

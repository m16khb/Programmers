package my.Level1;

public class DigitSum {

	public static void main(String[] args) {
		DigitSum ds = new DigitSum();
		System.out.println(ds.solution(987));
	}

	public int solution(int n) {
		int answer = 0;

		while(n != 0) {
			answer += n%10;
			n /= 10;
		}
		
		return answer;
	}
}

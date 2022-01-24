package my.Level1;

public class Year2016 {

	public static void main(String[] args) {
		Year2016 y = new Year2016();
		System.out.println(y.solution(12, 31));
	}

	public String solution(int a, int b) {
		String answer = "";
		int blank = 4;
		int month_value[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int sum = 0;
		sum += blank;
		for (int i = 0; i < a - 1; i++) {
			sum += month_value[i];
		}
		sum += b;
		int day = sum % 7;
		String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		answer = days[day];
		
		return answer;
	}
}

package my.Level1;

public class WaterMelon {

	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		System.out.println(wm.solution(4));
	}

	public String solution(int n) {
		String answer = "";

		for (int i = 1; i < n + 1; i++) {
			if (i % 2 == 1) {
				answer += "수";
			} else if (i % 2 == 0) {
				answer += "박";
			}
		}

		return answer;
	}
}

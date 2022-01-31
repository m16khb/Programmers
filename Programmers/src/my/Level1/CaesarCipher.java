package my.Level1;

public class CaesarCipher {
	public static void main(String[] args) {
		CaesarCipher cc = new CaesarCipher();
		System.out.println(cc.solution("a B z", 4));
	}

	public String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer += s.charAt(i);
			} else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				if (s.charAt(i) + n > 90) {
					answer += (char) ((s.charAt(i) + n) % 90 + 64);
				} else {
					answer += (char) (s.charAt(i) + n);
				}
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				if (s.charAt(i) + n > 122) {
					answer += (char) ((s.charAt(i) + n) % 122 + 96);
				} else {
					answer += (char) (s.charAt(i) + n);
				}
			}
		}

		return answer;
	}
}

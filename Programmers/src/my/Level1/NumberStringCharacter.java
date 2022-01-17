package my.Level1;

public class NumberStringCharacter {
	//숫자 문자열과 영단어
	public int solution(String s) {

		int answer = 0;
		String[] alphaNumber = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String regix = "";
		for (int i = 0; i < 10; i++) {
			regix = regix + alphaNumber[i];
			s = s.replaceAll(regix, i + "");
			regix = "";
		}
		answer = Integer.parseInt(s);
		return answer;
	}

	public static void main(String[] args) {
		NumberStringCharacter s = new NumberStringCharacter();
		System.out.println(s.solution("one4seveneight"));
	}

}

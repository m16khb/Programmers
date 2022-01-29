package my.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DartGame {

	public static void main(String[] args) {
		DartGame dg = new DartGame();
		System.out.println(dg.solution("1D2S#10S"));
	}

	public int solution(String dartResult) {
		int answer = 0;

		Pattern p = Pattern.compile("([0-9]+[SDT]+[*#]*)"); //정규식을 통해 0-9 숫자가 한개이상 포함되고 SDT 중 한개이상의 문자가 포함되고 *#중 0개 이상 포함되는 패턴 생성
		Matcher m = p.matcher(dartResult); //해당 패턴을 통해 문자열 추출

		ArrayList<String> strarr = new ArrayList<>();

		//추출된 문자열들을 리스트 형태로 변경
		while (m.find()) {
			strarr.add(m.group());
		}

		//계산을 starPrize 계산을 용이하게 하기 위해 거꾸로 정렬
		Collections.reverse(strarr);

		//계산
		int starPrize = 0;
		for (String token : strarr) {
			StringBuilder str = new StringBuilder();
			str.append(token);
			String option = "";
			if (token.charAt(token.length() - 1) == '*' || token.charAt(token.length() - 1) == '#') {
				option = str.charAt(str.length() - 1) + "";
				str.deleteCharAt(str.length() - 1);
			}
			String bonusStr = str.charAt(str.length() - 1) + "";
			str.deleteCharAt(str.length() - 1);
			int bonus = 1;
			switch (bonusStr) {
			case "D":
				bonus = 2;
				break;
			case "T":
				bonus = 3;
				break;
			}

			int num = Integer.parseInt(str.toString());
			// System.out.println(num + "," + bonus + "," + option);
			int temp = 0;
			if (option.equals("*"))
				temp = 2 * (int) Math.pow(num, bonus);
			else
				temp = (int) Math.pow(num, bonus);

			if (starPrize > 0) {
				temp = 2 * temp;
				starPrize--;
			}

			if (option.equals("#"))
				temp *= -1;

			if (option.equals("*"))
				starPrize += 1;

			answer += temp;
		}

		return answer;
	}
}

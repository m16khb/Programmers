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

		Pattern p = Pattern.compile("([0-9]+[SDT]+[*#]*)");
		Matcher m = p.matcher(dartResult);

		ArrayList<String> strarr = new ArrayList<>();

		while (m.find()) {
			strarr.add(m.group());
		}

		Collections.reverse(strarr);

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

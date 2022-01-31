package my.Level1;

import java.util.ArrayList;

public class NumberOfPandYinString {

	public static void main(String[] args) {
		NumberOfPandYinString nopys = new NumberOfPandYinString();
		nopys.solution("pPoooyY");
	}

	boolean solution(String s) {
		boolean answer = true;
		ArrayList<Character> p = new ArrayList<>();
		ArrayList<Character> y = new ArrayList<>();

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				p.add(s.charAt(i));
			} else if (s.charAt(i) == 'y') {
				y.add(s.charAt(i));
			}
		}

		if (p.size() == y.size()) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}
}

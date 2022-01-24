package my.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class TernaryReverse {

	public static void main(String[] args) {
		TernaryReverse tr = new TernaryReverse();
		System.out.println(tr.solution(45));
	}

	public int solution(int n) {
		int answer = 0;

		ArrayList<Integer> Ternary = new ArrayList<>();

		while (n != 0) {
			Ternary.add(n % 3);
			n = n / 3;
		}
		
		Collections.reverse(Ternary);
		for (int i = 0; i < Ternary.size(); i++) {
			answer += Ternary.get(i) * Math.pow(3, i);
		}

		return answer;
	}
}

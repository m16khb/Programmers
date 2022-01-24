package my.Level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SelectTwoNumSum {
	public static void main(String[] args) {
		SelectTwoNumSum stns = new SelectTwoNumSum();
		System.out.println(Arrays.toString(stns.solution(new int[] {1,2,3,4,5,6,7,8,9,10,1,5,63,7,9,41,3,4 })));
	}

	public int[] solution(int[] numbers) {
		int[] answer = {};
		int[] result = {};
		int count = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				count++;
			}
		}

		result = new int[count];
		count = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				result[count++] = numbers[i] + numbers[j];
			}
		}

		HashSet<Integer> hs = new HashSet<>();
		for (int i : result) {
			hs.add(i);
		}

		answer = new int[hs.size()];
		Iterator<Integer> iter = hs.iterator();
		int k = 0;
		while (iter.hasNext()) {
			answer[k++] = iter.next();
		}

		for (int i = 0; i < answer.length - 1; i++) {
			for (int j = i + 1; j < answer.length; j++) {
				if (answer[i] > answer[j]) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}

			}
		}

		return answer;
	}
}

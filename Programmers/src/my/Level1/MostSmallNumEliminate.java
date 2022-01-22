package my.Level1;

public class MostSmallNumEliminate {
	public int[] solution(int[] arr) {
		int[] answer = {};

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}

		int count = 0;
		for (int num : arr) {
			if (num > min)
				count++;
		}

		if (count == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[count];
		}

		int i = 0;
		for (int num : arr) {
			if (num > min) {
				answer[i] = num;
				i++;
			}
		}

		return answer;
	}
}

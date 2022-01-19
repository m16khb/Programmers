package my.Level1;

import java.util.Arrays;

public class TrainingCloth {

	public static void main(String[] args) {
		TrainingCloth tc = new TrainingCloth();
		int[] a = { 4, 3 };
		int[] b = { 3, 2 };
		System.out.println(tc.solution(5, a, b));
	}

	//체육복
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] students = new int[n];

		//앞에서 부터 순차적으로 계산하기 위한 정렬
		//안하니까 오류남
		Arrays.sort(lost);
		Arrays.sort(reserve);

		for (int i = 0; i < students.length; i++) {
			students[i] = 1;
		}
		for (int i = 0; i < lost.length; i++) {
			students[lost[i] - 1]--;
		}
		for (int i = 0; i < reserve.length; i++) {
			students[reserve[i] - 1]++;
		}

		for (int i = 0; i < lost.length; i++) {
			//현재 자기 자신이 가진 옷의 수가 없을 경우에만 빌림
			if (students[lost[i] - 1] == 0) {
				if (lost[i] - 2 >= 0) {
					if (students[lost[i] - 2] == 2) {
						students[lost[i] - 2]--;
						students[lost[i] - 1]++;
						continue;
					}
				}
				if (lost[i] < n) {
					if (students[lost[i]] == 2) {
						students[lost[i]]--;
						students[lost[i] - 1]++;
						continue;
					}
				}
			}
		}

		for (int i : students) {
			if (i > 0)
				answer++;
		}

		return answer;
	}
}

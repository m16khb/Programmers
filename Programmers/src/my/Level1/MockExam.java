package my.Level1;

public class MockExam {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		MockExam me = new MockExam();
		int[] a = { 0 };
		int[] b = me.solution(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] result = {};
		result = new int[3];

		int[][] giveUpMathMan = { { 1, 2, 3, 4, 5 }, 
								  { 2, 1, 2, 3, 2, 4, 2, 5 }, 
								  { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		for (int i = 0; i < result.length; i++) {
			result[i] = rank(answers, giveUpMathMan[i]);
		}

		int max = 0;
		int count = 0;
		
		for (int j = 0; j < result.length; j++) {
			if (max < result[j])
				max = result[j];
		}

		for (int k = 0; k < result.length; k++) {
			if (max == result[k])
				count++;
		}
		
		answer = new int[count];
		int k = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == max) {
				answer[k] = i + 1;
				k++;
			}
		}

		return answer;
	}

	public int rank(int[] answers, int[] giveUpMathMan) {
		int value = 0;
		int i = 0;
		boolean flag = true;
		while (i < answers.length && flag) {
			for (int j = 0; j < giveUpMathMan.length; j++) {
				if (i == answers.length) {
					flag = false;
					break;
				}
				if (giveUpMathMan[j] == answers[i])
					value++;
				i++;
			}
		}
		return value;
	}

}

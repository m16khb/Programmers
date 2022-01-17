package my.Level1;

class LottoBestWorst {
	public int[] solution(int[] lottos, int[] win_nums) {
		//로또 최고 순위와 최저 순위
		int[] answer = {};
		answer = new int[2];
		int best = 0;
		int worst = 0;
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos.length; j++) {
				if (lottos[i] == win_nums[j]) {// lottos와 win_nums중 같은 것이 있으면 best와 worst 둘 다 증가
					best++;
					worst++;
					break;
				} else if (lottos[i] == 0) {// lottos에 0 이 있을경우 best만 증가
					best++;
					break;
				}
			}
		}
		answer[0] = getScore(best);
		answer[1] = getScore(worst);
		return answer;
	}

	public static int getScore(int num) {// 맞춘 개수에 따라 등수를 가져오는 메소드
		int score = 0;
		switch (num) {
		case 6:
			score = 1;
			break;
		case 5:
			score = 2;
			break;
		case 4:
			score = 3;
			break;
		case 3:
			score = 4;
			break;
		case 2:
			score = 5;
			break;
		case 1, 0:
			score = 6;
			break;
		}
		return score;
	}

	public static void main(String[] args) {
		LottoBestWorst s = new LottoBestWorst();
		int[] a = { 44, 1, 0, 0, 31, 25 };
		int[] b = { 31, 10, 45, 1, 6, 19 };
		int[] c = s.solution(a, b);
		System.out.println("[" + c[0] + "," + c[1] + "]");
	}
}
package my.Level1;

public class Failture {

	public static void main(String[] args) {
		Failture f = new Failture();
		f.solution(5, new int[] { 4,4,4,4,4 });
	}

	// N 전체 스테이지의 수 stages 사용자가 현재 멈춰있는 스테이지
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[] result = new double[N];
		int[] clear_user_num = new int[N + 1];

		for (int i : stages) {
			clear_user_num[i - 1]++;
		}

		int current_stage_user = stages.length;

		for (int i = 0; i < answer.length; i++) {
			//반례 5, {4,4,4,4,4}
			//double의 경우 0으로 나누는 에러메세지가 출력이 안됌
			if(current_stage_user == 0) {
				result[i] = 0;
				break;
			}
			result[i] = (double) (clear_user_num[i]) / (double) (current_stage_user);
			current_stage_user -= clear_user_num[i];
		}

		for (int k = 0; k < answer.length; k++) {
			int maxIndex = 0;
			double max = -1;
			for (int i = 0; i < result.length; i++) {
				if (max < result[i]) {
					max = result[i];
					maxIndex = i + 1;
				}
			}
			answer[k] = maxIndex;
			result[maxIndex - 1] = -1;
		}
		
		return answer;
	}
}

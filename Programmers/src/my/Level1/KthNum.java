package my.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthNum {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		KthNum kn = new KthNum();
		int[] n = {1, 5, 2, 6, 3, 7, 4};
		int[][] k = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		int[] answer = kn.solution(n, k);
		for (int i = 0; i < answer.length; i++) {			
			System.out.print(answer[i] + " ");
		}
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		List<Integer> arr = new ArrayList<>();

		for (int i : array) {
			arr.add(i);
		}

		answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			List<Integer> temp;
			//이렇게 하면 sort시 arr도 sort됨 얕은복사? 일듯
			//temp = arr.subList(commands[i][0]-1, commands[i][1]); 
			temp = new ArrayList<Integer>(arr.subList(commands[i][0]-1, commands[i][1]));
			Collections.sort(temp);
			answer[i] = temp.get(commands[i][2] - 1);
		}

		return answer;
	}
}

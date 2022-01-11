package my.Level1;

import java.util.ArrayList;

public class CrainDollDraw {
//	0 0 0 0 0
//	0 0 1 0 3
//	0 2 5 0 1
//	4 2 4 4 2
//	3 5 1 3 1
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> bucket = new ArrayList<Integer>();
		for (int i = 1; i <= moves.length; i++) {
			for (int j = 1; j <= board.length; j++) {
				if (board[j - 1][moves[i - 1] - 1] != 0) {
					bucket.add(board[j - 1][moves[i - 1] - 1]);
					board[j - 1][moves[i - 1] - 1] = 0;
					answer += remove(bucket);
					break;
				}
			}
		}
		return answer;
	}

	public int remove(ArrayList<Integer> bucket) {
		int result = 0;
		if (bucket.size() > 1) {
			for (int i = 0; i < bucket.size() - 1; i++) {
				if (bucket.get(i) == bucket.get(i + 1)) {
					bucket.remove(i);
					bucket.remove(i);
					result += 2; //인형이 파괴 되었을 경우 2증가
					result += remove(bucket); //인형이 파괴되면서 위에있던 인형과 만나 다시 파괴 될 수도 있으니 재귀호출
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		CrainDollDraw s = new CrainDollDraw();
		System.out.println(s.solution(board, moves));
	}
}

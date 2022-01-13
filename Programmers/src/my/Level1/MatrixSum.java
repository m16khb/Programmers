package my.Level1;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		MatrixSum s = new MatrixSum();
		s.solution(null, null);
	}

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}

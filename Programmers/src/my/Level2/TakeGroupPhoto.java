package my.Level2;

public class TakeGroupPhoto {
	int answer = 0;
	String[] friends = new String[] { "A", "C", "F", "J", "M", "N", "R", "T" };

	public static void main(String[] args) {
		TakeGroupPhoto tgp = new TakeGroupPhoto();
		System.out.println(tgp.solution(2, new String[] { "N~F=0", "R~T>2" }));
	}

	public int solution(int n, String[] data) {
		boolean[] isInLine = new boolean[8];
		DFS(data, isInLine, "");

		return answer;
	}

	public void DFS(String[] data, boolean[] isInLine, String inputNames) {
		if (inputNames.length() == 7) {
			if (checkCondition(inputNames, data)) {
				answer++;
			}
			return;
		}
		// 모든 경우의 수 다 구하기
		for (int i = 0; i < isInLine.length; i++) {
			if (!isInLine[i]) {
				isInLine[i] = true;
				String name = inputNames + friends[i];
				DFS(data, isInLine, name);
				isInLine[i] = false;
			}
		}
	}

	public boolean checkCondition(String inputNames, String[] data) {
		for (String condition : data) {
			int n = inputNames.indexOf(condition.charAt(0));
			int m = inputNames.indexOf(condition.charAt(2));
			char op = condition.charAt(3);
			int index = Character.getNumericValue(condition.charAt(4));
			if(op == '=') {
				if(Math.abs(n - m) != index + 1)
					return false;
			}
			else if(op == '<') {
				if(Math.abs(n - m) >= index  + 1)
					return false;
			}
			else if(op == '>') {
				if(Math.abs(n - m) <= index +1)
					return false;
			}
		}

		return true;
	}
}

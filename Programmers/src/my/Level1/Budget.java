package my.Level1;

public class Budget {

	public static void main(String[] args) {
		Budget b = new Budget();
		System.out.println(b.solution(new int[] { 2,2,3,3 }, 10));
	}

	public int solution(int[] d, int budget) {
		int answer = 0;

		while (true) {
			if (sum(d) > budget) {
				d = remove_max(d);
			} else {
				break;
			}
		}
		
		for (int i = 0; i < d.length; i++) {
			if(d[i] != 0)
				answer++;
		}

		return answer;
	}

	int sum(int[] d) {
		int sum = 0;

		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}

		return sum;
	}

	int[] remove_max(int[] d) {
		int max = 0;
		for (int i = 0; i < d.length; i++) {
			if (max < d[i]) {
				max = d[i];
			}
		}
		for (int i = 0; i < d.length; i++) {
			if (d[i] == max) {
				d[i] = 0;
				break;
			}
		}
		return d;
	}
}

package my.Level1;

public class LeastRectangle {

	public static void main(String[] args) {
		LeastRectangle lr = new LeastRectangle();
		System.out.println(lr.solution(new int[][] { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } }));
	}

	public int solution(int[][] sizes) {
		int answer = 0;

		int size = sizes[0][0] * sizes[0][1];
		int sizeIndex = 0;
		for (int i = 1; i < sizes.length; i++) {
			if (size > sizes[i][0] * sizes[i][1]) {
				size = sizes[i][0] * sizes[i][1];
				sizeIndex = i;
			}
		}

		int[] current_size = sizes[sizeIndex];
		for (int i = 0; i < sizes.length; i++) {
			if (!isSize(current_size, sizes[i])) {
				current_size = setSize(current_size, sizes[i]);
			}
		}

		answer = current_size[0] * current_size[1];
		return answer;
	}

	boolean isSize(int[] current_size, int[] size) {
		boolean flag = false;

		// 가로 비교
		if (current_size[0] >= size[0]) {
			// 세로 비교
			if (current_size[1] >= size[1])
				flag = true;
			// 만약 세로가 더 작다면
			if (current_size[1] < size[1]) {
				// 가로 세로 변환 후 비교
				if (current_size[0] >= size[1]) {
					if (current_size[1] >= size[0])
						flag = true;
				}
			}
			// 가로가 더 작다면
		} else {
			// 가로 세로 변환 후 비교
			if (current_size[0] >= size[1]) {
				if (current_size[1] >= size[0])
					flag = true;
			}
		}
		return flag;
	}

	int[] setSize(int[] current_size, int[] size) {
		int[] case1 = new int[2];
		// 정방향
		if (current_size[0] >= size[0]) {
			case1[0] = current_size[0];
		} else {
			case1[0] = size[0];
		}
		if (current_size[1] >= size[1]) {

			case1[1] = current_size[1];
		} else {
			case1[1] = size[1];
		}

		int[] case2 = new int[2];
		// 가로세로 변경
		if (current_size[0] >= size[1]) {
			case2[0] = current_size[0];
		} else {
			case2[0] = size[1];
		}
		if (current_size[1] >= size[0]) {

			case2[1] = current_size[1];
		} else {
			case2[1] = size[0];
		}

		if ((case1[0] * case1[1]) <= (case2[0] * case2[1])) {
			return case1;
		} else {
			return case2;
		}
	}
}

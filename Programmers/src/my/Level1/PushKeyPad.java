package my.Level1;

public class PushKeyPad {

	public String solution(int[] numbers, String hand) {
		String answer = "";
		String[] left = { "1", "4", "7", "*" };
		String[] center = { "2", "5", "8", "0" };
		String[] right = { "3", "6", "9", "#" };
		String[][] touch_pad = { left, center, right };
		String left_last_touch = "*";
		String right_last_touch = "#";

		for (int i = 0; i < numbers.length; i++) {
			if (contain(left, numbers[i])) {
				answer += "L";
				left_last_touch = numbers[i] + "";
			} else if (contain(right, numbers[i])) {
				answer += "R";
				right_last_touch = numbers[i] + "";
			} else {
				int[] left_xy = getXY(touch_pad, left_last_touch);
				int[] xy = getXY(touch_pad, numbers[i] + "");
				int[] right_xy = getXY(touch_pad, right_last_touch);

				if (Math.abs(xy[0] - left_xy[0]) + Math.abs(xy[1] - left_xy[1]) > Math.abs(xy[0] - right_xy[0])
						+ Math.abs(xy[1] - right_xy[1])) {
					answer += "R";
					right_last_touch = numbers[i] + "";
				} else if (Math.abs(xy[0] - left_xy[0]) + Math.abs(xy[1] - left_xy[1]) < Math.abs(xy[0] - right_xy[0])
						+ Math.abs(xy[1] - right_xy[1])) {
					answer += "L";
					left_last_touch = numbers[i] + "";
				} else {
					if (hand.equals("right")) {
						answer += "R";
						right_last_touch = numbers[i] + "";
					} else {
						answer += "L";
						left_last_touch = numbers[i] + "";
					}
				}
			}
		}

		return answer;
	}

	static boolean contain(String[] numbers, int number) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].equals(number + ""))
				return true;
		}
		return false;
	}

	static int[] getXY(String[][] touch_pad, String str) {
		int[] xy = { 0, 0 };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (touch_pad[i][j].equals(str)) {
					xy[0] = j;
					xy[1] = i;
				}
			}
		}
		return xy;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		PushKeyPad s = new PushKeyPad();
		System.out.println(s.solution(new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 }, "left"));
	}

}

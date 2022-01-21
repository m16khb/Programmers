package my.Level1;

import java.util.HashSet;

public class Poncketmon {
	public static void main(String[] args) {
		Poncketmon p = new Poncketmon();
		int[] a = { 3, 3, 3, 2, 2, 4 };
		System.out.println(p.solution(a));
	}

	public int solution(int[] nums) {
		int answer = 0;
		int n = nums.length / 2;

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}

		answer = hs.size() > n ? n : hs.size();
		return answer;
	}
}

package my.Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();

		for (String str : s.solution(new String[] { "azxtab", "xxteeg", "abxasdf", "acxaaaa" }, 2)) {
			System.out.print(str + " ");
		}

	}

	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strings));
		al.sort(null);
		
		for (int i = 0; i < al.size();) {
			for (int j = i+1; j < al.size(); j++) {
				if (al.get(i).charAt(n) > al.get(j).charAt(n)) {
					String temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
			ans.add(al.remove(0));
			al.sort(null);
		}

		answer = ans.toArray(new String[ans.size()]);
		return answer;
	}
}

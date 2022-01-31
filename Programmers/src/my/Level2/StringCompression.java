package my.Level2;

import java.util.ArrayList;

public class StringCompression {

	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		System.out.println(sc.solution("aabbaccc"));
	}

	public int solution(String s) {
		int answer = s.length();

		for (int i = 1; i < s.length(); i++) {
			int result = Compression(splitString(s, i));
			if (answer > result) {
				answer = result;
			}
		}

		return answer;
	}

	public ArrayList<String> splitString(String s, int num) {
		ArrayList<String> strarr = new ArrayList<>();
		for (int i = 0; i < s.length(); i += num) {
			if (i + num < s.length())
				strarr.add(s.substring(i, i + num));
			else
				strarr.add(s.substring(i, s.length()));
		}
		return strarr;
	}

	public int Compression(ArrayList<String> strarr) {
		String str = "";
		int num = 0;
		for (int i = 0; i < strarr.size(); i += (num + 1)) {
			num = compare(strarr, i);
			if (num > 0)
				str += (num + 1) + strarr.get(i);
			else {
				str += strarr.get(i);
				num = 0;
			}
		}

		return str.length();
	}

	public int compare(ArrayList<String> strarr, int start) {
		int result = 0;
		for (int i = start; i < strarr.size() - 1; i++) {
			if (!(strarr.get(i).equals(strarr.get(i + 1)))) {
				result = i - start;
				break;
			} else {
				result = i - start;
			}
			
			//array의 마지막과 비교를 위해
			if(i == strarr.size()-2) {
				if ((strarr.get(strarr.size()-2).equals(strarr.get(strarr.size()-1)))) {
					result ++;
				}
			}
		}

		return result;
	}
}

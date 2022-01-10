package my.Level1;

//1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

public class NewIdRecommend {
	public String solution(String new_id) {
		String answer = "";

		answer = new_id.toLowerCase(); // 1단계

		answer = answer.replaceAll("[^0-9|^a-z|^\\.\\_\\-]", ""); // 2단계
		answer = answer.replaceAll("[\\^]", ""); // 2단계

		answer = answer.replaceAll("[\\.]+", "."); // 3단계

		if (!answer.isEmpty()) {
			if (answer.charAt(0) == '.')// 4단계
				answer = answer.substring(1);
		}
		if (!answer.isEmpty()) {
			if (answer.charAt(answer.length() - 1) == '.') {
				StringBuilder str = new StringBuilder(answer);
				answer = str.deleteCharAt(answer.length() - 1).toString();
			}
		}

		if (answer.isEmpty())// 5단계
			answer += "a";

		if (answer.length() >= 16) // 6단계
			answer = answer.substring(0, 15);
		if (!answer.isEmpty()) {
			if (answer.charAt(answer.length() - 1) == '.') {
				StringBuilder str = new StringBuilder(answer);
				answer = str.deleteCharAt(answer.length() - 1).toString();
			}
		}

		while (answer.length() <= 2)// 7단계
			answer += answer.charAt(answer.length() - 1);

		return answer;
	}

	public static void main(String[] args) {
		NewIdRecommend s = new NewIdRecommend();
		String answer = s.solution("abcdefghijklmn.p");
		System.out.println(answer);
	}

}

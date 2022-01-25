package my.Level1;

public class StrangeStringMake {

	public static void main(String[] args) {
		StrangeStringMake ssm = new StrangeStringMake();
		System.out.println(ssm.solution("hello  world Java  "));
	}

	public String solution(String s) {
		String answer = "";
		//공백 단위로 분리
		String[] splitStr = s.split(" ", -1);
		//뒤 공백 유지 해야 함
		//글자 간 공백도 유지해야 함
		for (int k =0;k<splitStr.length;k++) {
			String str = "";
			String trimStr = splitStr[k].trim();
			for (int i = 0; i < trimStr.length(); i++) {
				if (i % 2 == 0)
					str += Character.toUpperCase(trimStr.charAt(i));
				else
					str += Character.toLowerCase(trimStr.charAt(i));
			}
			splitStr[k] = str;
		}
		for (String str: splitStr) {
				answer += str + " ";
		}
		
		answer = answer.substring(0, answer.length()-1);
		
		return answer;
	}
}

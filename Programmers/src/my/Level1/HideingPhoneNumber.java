package my.Level1;

public class HideingPhoneNumber {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}
	//핸드폰 번호 가리기
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
			if(phone_number.length() - i > 4) {
				answer += "*";
			}
			else {
				answer += phone_number.charAt(i);
			}
		}
        //테스트
        return answer;
    }
}

package my.Level1;

public class NoNumberCheck {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}
	//수정
    public int solution(int[] numbers) {
        int answer = -1;
        answer++;
        
        for (int i = 1; i < 10; i++) {
        	boolean flag = true;
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[j] == i) 
					flag = false;
			}
			if(flag) {
				answer += i;
			}
			flag = true;
		}
        
        return answer;
    }
}

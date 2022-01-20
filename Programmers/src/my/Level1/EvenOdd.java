package my.Level1;

public class EvenOdd {
	public String solution(int num) {
        String answer = "";  
        answer = num % 2 == 0 ? "Even": "Odd";
        return answer;
    }
}

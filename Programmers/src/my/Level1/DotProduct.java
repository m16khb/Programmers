package my.Level1;

public class DotProduct {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}
	public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < b.length; i++) {
        	answer += a[i]*b[i];
		}
        return answer;
    }
}

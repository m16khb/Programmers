package my.Level1;
import java.util.*;

public class DontWantSameNumber {

	public static void main(String[] args) {
		DontWantSameNumber dwsn = new DontWantSameNumber();
		for (int i : dwsn.solution(new int[] {1,1,3,3,0,1,1})) {
			System.out.print(i + ", ");
		}
	}
	
	//효율성 테스트를 위해 remove를 쓰면 안됌 새로운 배열에 하나씩 추가하는 방식을 사용
    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> iarr = new ArrayList<Integer>();

        
        for (int i = 0; i < arr.length; i++) {
			if(i+1 < arr.length) {
				if(arr[i] != arr[i + 1]) {
					iarr.add(arr[i]);
				}
			}
		}
        iarr.add(arr[arr.length-1]);
        
        answer = new int[iarr.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = iarr.get(i);
		}
        return answer;
    }
}

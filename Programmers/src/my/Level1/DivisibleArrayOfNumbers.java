package my.Level1;

import java.util.ArrayList;

public class DivisibleArrayOfNumbers {

	public static void main(String[] args) {
		DivisibleArrayOfNumbers daon = new DivisibleArrayOfNumbers();
		
		for (int i : daon.solution(null, 0)) {		
			System.out.print(i + " ");
		}
	}
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				temp.add(arr[i]);
			}
		}
        
        temp.sort(null);
        
        if(temp.size() == 0) {
        	answer = new int[] {-1};
        }else {
        	answer = new int[temp.size()];
        	for (int i = 0; i < answer.length; i++) {
				answer[i] = temp.get(i);
			}
        }
        
        return answer;
    }
}

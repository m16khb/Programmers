package my.Level1;

public class NaturalNumberReverseMakeArray {

	public static void main(String[] args) {
		NaturalNumberReverseMakeArray nnrm = new NaturalNumberReverseMakeArray();
		for (int i : nnrm.solution(12345)) {			
			System.out.print(i + ", ");
		}
	}

	public int[] solution(long n) {
		int[] answer = {};
		
		String str = n +"";
		answer = new int[str.length()];
		int count =0;
		for (int i = str.length() - 1; i >= 0; i--) {
			answer[count++] = Character.getNumericValue(str.charAt(i));  
		}	
		return answer;
	}
}

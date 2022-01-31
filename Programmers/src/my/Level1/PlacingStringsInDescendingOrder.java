package my.Level1;

public class PlacingStringsInDescendingOrder {

	public static void main(String[] args) {
		int a, b;
		a = 'Z';
		b = 'z';
		System.out.println(a);
		System.out.println(b);
	}

	public String solution(String s) {
		String answer = "";

		int[] temp = new int[s.length()];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = s.charAt(i);
		}
		
		for (int i = 0; i < temp.length-1; i++) {
			for (int j = i+1; j < temp.length; j++) {
				if(temp[i] < temp[j]) {
					int tempChar = temp[i];
					temp[i] = temp[j];
					temp[j] = tempChar;
				}
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			answer += (char)temp[i];
		}
		
		return answer;
	}
}

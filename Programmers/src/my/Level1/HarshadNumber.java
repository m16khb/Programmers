package my.Level1;

public class HarshadNumber {
	public boolean solution(int x) {
		char[] str = String.valueOf(x).toCharArray();
		int sum = 0;
        
		for(char answer : str) {
			sum += Character.getNumericValue(answer);
		}

		return x%sum == 0 ? true : false;
	}
}

package my.Level1;

public class StringHandlingBasics {

	public static void main(String[] args) {
		int a = '1';
		int b = '9';
		int c = '0';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
        	for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) < 48 || s.charAt(i) > 57) {
					answer = false;
				}
			}
        }else {
        	answer = false;
        }
        
        return answer;
    }
}

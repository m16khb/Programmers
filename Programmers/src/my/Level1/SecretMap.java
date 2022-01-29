package my.Level1;

public class SecretMap {

	public static void main(String[] args) {
		SecretMap sm = new SecretMap();
		for (String str : sm.solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})) {
			System.out.println(str);
		}	
	}

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];
        int[] map = new int[n];
        
        for (int i = 0; i < map.length; i++) {
			map[i] = arr1[i] | arr2[i];
		}
        
        for (int i = 0; i < map.length; i++) {
			int num = map[i];
			StringBuilder sb = new StringBuilder();
			for (int m = 0; m < n; m++) {
				if(num % 2 == 0) {
					sb.append(" ");
				}else {
					sb.append("#");
				}
				num /= 2;
			}
			sb.reverse();
			answer[i] = sb.toString();
		}        
        
        return answer;
    }
}

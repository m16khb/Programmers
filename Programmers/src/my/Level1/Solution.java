package my.Level1;

public class Solution {
	public int solution(String s) {
		
        int answer = 0;
        String[] alphaNumber = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String regix = "";
        for(int i = 0;i<10;i++) {
        	regix = regix + alphaNumber[i];
        	s = s.replaceAll(regix, i+"");
        	regix = "";
        }
        answer = Integer.parseInt(s);
        return answer;
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("one4seveneight"));
	}

}

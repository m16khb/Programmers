package my.Level1;

public class IntegerSquareRoot {

	public static void main(String[] args) {

	}
    public long solution(long n) {
        long answer = 0;
        
        double k = Math.sqrt(n);
        if((long)(k)*(long)(k) == n) {
        	answer = (long)(k+1) * (long)(k+1);
        }else {
        	answer = -1;
        }
        
        return answer;
    }
}

package my.Level1;

public class LakingMoneyCalculate {

	public static void main(String[] args) {
		LakingMoneyCalculate lmc = new LakingMoneyCalculate();
		System.out.println(lmc.solution(3, 20, 4));
	}
	
    public long solution(int price, int money, int count) {
        long answer = -1;

        if(money > (price * sum(count))) {
        	answer = 0; 
        }else {
        	answer = (price * sum(count)) - money;
        }
        
        return answer;
    }
    
    
    long sum(int num) {
    	long sum = 0;
    	for (int i = 1; i < num+1; i++) {
			sum += i;
		}
    	return sum;
    }
    static int factorial(int num) {
    	if(num == 1)
    		return 1;
    	return num * factorial(num -1);
    }
}

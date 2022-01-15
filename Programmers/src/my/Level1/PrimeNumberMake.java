package my.Level1;

public class PrimeNumberMake {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		PrimeNumberMake pnm = new PrimeNumberMake();
		int[] a = {1,2,3,4};
		System.out.println(pnm.solution(a));
	}
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if(i >= j) {
					continue;
				}
				for (int n = 2; n < nums.length; n++) {
					if(j >= n) {
						continue;
					}
					if(isPrim(nums[i],nums[j],nums[n]))
						answer ++;
				}
			}
			
		}
 
        return answer;
    }
    
    public boolean isPrim(int a, int b, int c) {
    	
    	int sum = a+b+c;
    	for (int i = 2; i < sum; i++) {
    		if(sum % i == 0)
    			return false;
		}
    	
    	return true;
    }
}

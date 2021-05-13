

public class Biweekly {
	public static int max_ham(int n, int range) {
		int y = Integer.MIN_VALUE;
		int ans = -1;
		for(int i = 0; i < Math.pow(range, 2)-1; ++i) {
			int x = i ^ n;
			if(x >y) {
				y = x;
				ans =i;
				
			
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {0,1,1,3};
		int maximumBit = 3;
		int len = nums.length;
		int[] ans = new int[len];
		int k = len - 1;
		int x = max_ham(nums[0], maximumBit);
		ans[k--] = x;
		
		x = nums[0];
		for(int i = 1; i < len; i++) {
			x ^= nums[i];
			ans[k--] = max_ham(x, maximumBit);
		}
		
		for(int i = 0;i <len; i++) {
			System.out.println(ans[i]);
		}
 		
	}
}

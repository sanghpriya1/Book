import java.util.HashMap;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
		int len = 0; 
        boolean ans = false;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < len; i++){
            if(!mp.containsKey(nums[i]))
                mp.put(nums[i], 1);
            else {
            	ans = true;
                 break;}
        }
        System.out.println(ans);
	}

}

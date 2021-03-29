import java.util.Stack;

public class NGE {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,1};
		int len = nums.length;
//		int size = 2*len;
//	    int[] arr = new int[size];
//	    for(int i = 0; i < len; i++) {
//	    	arr[i] = nums[i];
//	    	
//	    	arr[len+i] = nums[i];
//	    }
	    
	    Stack<Integer> S = new Stack<>();
	    S.push(0);
	    
	    int[] ans = new int[len];
	    
	    	for(int i = 1; i < len; i++) {
	    		while(S.isEmpty() == false && nums[S.peek()] < nums[i]) {
	    			ans[S.peek()] = nums[i];
	    			S.pop();
	    		}
	    		S.push(nums[i]);
	    	}
	    	
	    	
	    while(!S.isEmpty()) {
	    	ans[S.pop()] = -1;
	    }
	    
	  for(int i = 0; i < len; ++i) {
		  System.out.println(ans[i]);
	  }
 	}
}

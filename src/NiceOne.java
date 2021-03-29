import java.util.ArrayList;
import java.util.List;

public class NiceOne {
	private static int isfactor(int n, int x){
        while(n%x == 0){
            n= n/x;
        }
        return n;
    }
    private static boolean isUgly(int n) {
        if(n <= 0)return false;
        if(n == 1)return true;
        n = Math.abs(n);
        n = isfactor(n, 2);
        if(n == 1)return true;
        n = isfactor(n, 3);
        if(n == 1)return true;
        n = isfactor(n, 5);
        if(n == 1)return true;
        return false;
        
    }
	public static void main(String[] args) {
		int n = 1352;
		 int i = 1;
		 List<Integer> lst = new ArrayList<Integer>();
	        int count = 0;
	        int ans = 0;
	        while(count < n){
	            if(isUgly(i)){
	                count++;
	                lst.add(i);
	                if(count == n){
	                	
	                    ans = i;
	                    break;
	                }
	                
	            }
	            i++;
	        }
	        System.out.println(ans);
	}
}

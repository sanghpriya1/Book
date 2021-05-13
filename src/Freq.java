import java.util.HashMap;

public class Freq {
	

	public static void main(String[] args) {
		
		int minimum_distance = 0;
		int[] arr = new int[] {1,2,3,1,1,3};
		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		int len = arr.length;
		for(int i = 0; i < len; ++i){
            if(!hmp.containsKey(arr[i]))hmp.put(arr[i], 0);
             
            else  {
            		int x = hmp.get(arr[i]) + 1;
            	minimum_distance += x;
            	hmp.put(arr[i], x);
            	
            }
                

            
        }
		System.out.println(minimum_distance);
	}

}

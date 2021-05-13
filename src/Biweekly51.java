
import java.util.Set;
import java.util.TreeMap;

public class Biweekly51 {

	public static void main(String[] args) {
		int[][] logs = { {1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048} };
		
		TreeMap<Integer, Integer> intervalEntry = new TreeMap<>();
		int len = logs.length;
		for (int i = 0; i < len; ++i) {
			if(!intervalEntry.containsKey(logs[i][0]))
			{intervalEntry.put(logs[i][0], 1);}
			else {
				intervalEntry.put(logs[i][0], intervalEntry.get(logs[i][0])+1);
			}
			
			if(!intervalEntry.containsKey(logs[i][1]-1)) {
				intervalEntry.put(logs[i][1]-1, 1);
			}
			else {
				if(logs[i][0] != logs[i][1]-1)
				intervalEntry.put(logs[i][1]-1, intervalEntry.get(logs[i][1]-1)+1);
			}

		}
		
		Set<Integer> set1 = intervalEntry.keySet();
		 
        int minPopulation = Integer.MIN_VALUE;
        int year = 0;
		for(Integer key : set1) {
            if(intervalEntry.get(key) > minPopulation) {
            	minPopulation = intervalEntry.get(key);
            	year = key;
            }
        }
		System.out.println(year
				);
			}

}

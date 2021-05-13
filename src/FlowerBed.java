import java.util.HashMap;

public class FlowerBed {
	public static void main(String[] args) {
		int[] deck = {1,2,3,4,4,3,2,1};
		HashMap<Integer, Integer> hmp = new HashMap<>();
		for(int i = 0; i < deck .length; ++i) {
			if(!hmp.containsKey(deck[i])) {
				hmp.put(deck[i], 1);
			}
			else
			hmp.put(deck[i], hmp.get(deck[i])+1);
		}
		int X = hmp.get(deck[0]);
		boolean ans = true;
		for(Integer value : hmp.values()) {
			if(value != X)ans = false;
		}
		
        System.out.println(ans);
	}
}

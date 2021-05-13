
import java.util.Arrays;
import java.util.List;

public class RemoveDup {
	private static List<List<Integer>> lst;
	private static void permutation(int curr_idx, List<Integer> list) {
		if(curr_idx == list.size()-1) {
			lst.add(list);
			return;
		}
		else {
			for(int i = curr_idx; i < list.size(); ++i) {
				int x = list.get(i);
				int y = list.get(curr_idx);
				 list.add(i, y);
				 list.add(curr_idx, x);
				
				permutation(curr_idx+1, list);
				 x = list.get(i);
				 y = list.get(curr_idx);
				 list.add(i, y);
				 list.add(curr_idx, x);
				
			}
		}
	}
	public static void main(String[] args) {
		Integer[] list = {1,2,3};
		List<Integer> lost =  Arrays.asList(list);
		permutation(0, lost);
		
		
	}

}

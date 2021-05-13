import java.util.HashMap;

public class Balloon {
	public static void main(String[] args) {
		String text = "loonbalxballpoon";
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		
		for(int i = 0; i < text.length(); ++i) {
			if(!hmp.containsKey(text.charAt(i))) {
				hmp.put(text.charAt(i), 1);
			}
			else
				hmp.put(text.charAt(i), hmp.get(text.charAt(i)) +1);
		}
		int x = Integer.MAX_VALUE;
		for(Integer val : hmp.values()) {
			x = Math.min(x, val);
		}
		System.out.println(x);
	}

}


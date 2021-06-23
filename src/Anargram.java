import java.util.HashMap;

public class Anargram {
	public static void main(String[] args) {
		String S = "anagram";
		String P = "margana";
		int lenS = S.length();
		int lenP = P.length();
		if(lenP != lenS)System.out.println("Not Anagrams");
		HashMap<Character, Integer> Smp = new HashMap<Character, Integer>();
		HashMap<Character, Integer> Pmp = new HashMap<Character, Integer>();
		for(int i = 0; i < lenP; ++i) {
			if(!Smp.containsKey(S.charAt(i))) {
				Smp.put(S.charAt(i), 1);
			}
			else Smp.put(S.charAt(i), Smp.get(S.charAt(i))+1);
			if(!Pmp.containsKey(P.charAt(i))) {
				Pmp.put(P.charAt(i), 1);
			}
			else Pmp.put(P.charAt(i), Pmp.get(P.charAt(i))+1);
		}
		
		
		
	}

}

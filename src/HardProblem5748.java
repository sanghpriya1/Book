
public class HardProblem5748 {
	private static boolean isvalid(String s) {
		int len = s.length();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for(int i = 0; i < len; ++i) {
			if(s.charAt(i) == '(') count1++;
			else if(s.charAt(i) == ')') {
				count1--;
				if(count1 < 0) {
					return false;
				}
				if(count2 > 0 && count1 == 0)return false;
				if(count2 > 0 && count3 == 0)return false;
			}
			if(s.charAt(i) == '{') count2++;
			else if(s.charAt(i) == '}') {
				count2--;
				if(count2 < 0) {
					return false;
				}
			}
			if(s.charAt(i) == '[') count3++;
			else if(s.charAt(i) == ']') {
				count3--;
				if(count3 < 0) {
					return false;
				}
			}
		}
		if(count1 == 0 && count2 == 0 && count3 == 0)return true;
		else return false;
	}
	public static void main(String[] args) {
		String s = "([)]";
		System.out.println(isvalid(s));
		
	}
}

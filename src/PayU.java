
public class PayU {
	private static boolean isBalanced2(String S) {
		boolean ans = true;
		int len = S.length();
		int count = 0;
		for(int i = 0; i < len; ++i) {
			if(S.charAt(i) == '(' ) count++;
			else {
				count--;
				if(count < 0) {
					return false;
					
				}
			}
		}
		if(count!=0)ans = false;
		
		
		return ans;
		
	}
	private static boolean isBalanced(String s) {
		boolean ans = true;
		Stack<Character> P = new Stack<>();
		int len = s.length();
		for (int i = 0; i < len; ++i) {
			if (s.charAt(i) == '(')
				P.push('(');
			else
				P.pop();
		}
		if (!P.isEmpty())
		ans = false;
		return ans;
	}

	public static void main(String[] args) {
		String S = "()()()";
		//System.out.println(isBalanced(S));
		int counts = 0;
		int len = S.length();
		for(int i = 0; i < len - 1; ++i) {
			for(int j = i+1; j < len; ++j)
			{
				String St = S.substring(i, j+1);
						if(isBalanced2(St)) counts++;
			}
		}
		
		System.out.println(counts);

	}

}

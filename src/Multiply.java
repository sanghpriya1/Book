

public class Multiply {
	public static void main(String[] args) {
		String A = "123";
		String B = "456";
		int a =(int) Math.floor(Math.log10(Math.abs(Integer.parseInt(A)))
				+ Math.log10(Math.abs(Integer.parseInt(B)))) + 1;
		
		
		
		System.out.println(a);
		int len = B.length();
		len = len -1;
		int i = -1;
		while(len >=0) {
			int x = B.charAt(len)-'0';
			
			int size = A.length();
			size = size -1;
			int carry = 0;
			int zeros = len;
			zeros -= len-i;
			i++;
			
			String S = "";
			for(int j = 0; j <= zeros; j++) {
				S += '0';
			}
			
			len--;
			while(size >= 0) {
				int y = A.charAt(size) - '0';
				size--;
				y = y *x;
				y += carry;
				carry = y / 10;
				y = y %10;
				S += y;
				
			}
//			char[] ch = S.toCharArray();
//			String P = "";
//			for(int k = ch.length - 1; k >= 0; k--) {
//				 P += ch[k];
//			}
			System.out.println(S);
			
		}
		
	}
		
		
				

} 
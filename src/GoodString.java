import java.util.Scanner;

class GoodString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int N = sc.nextInt();
			int k = sc.nextInt();
			String S = sc.next();
			
	
		int count = 0;
		for(int i = 0; i < N/2; i++)
			{
			if(S.charAt(i) != S.charAt(N-(i+1)))
				count++;
			
			}
		count = Math.abs(k-count);
		System.out.println(count);
		}
		sc.close();
	}
}

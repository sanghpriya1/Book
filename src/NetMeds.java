import java.util.Random;

public class NetMeds {
	public static void main(String[] args) {
		int[] ans = new int[25];
		int[] arr = new int[26];
		for(int i = 0; i <= 25; i++) {
			arr[i] = -1;
		}
		
		int x = -2;
		Random rand = new Random();
		x = rand.nextInt(26);
		System.out.println(x);
		int i =0;
		int t = 25;
		while(t-- > 0) {
			
		if(arr[x] == -1) {
			arr[x] = 1;
			ans[i] = x;
		
		}
		
		}
	
	for(int j = 0; j < 25; ++j) {
	System.out.println(arr[j]);

	}
}}
	


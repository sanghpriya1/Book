import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WhiteBlock {
	private static int rev(int x) {

		int reverse = 0;
		while (x > 0) {
			int y = x % 10;
			reverse = reverse * 10 + y;
			x = x / 10;
		}
		System.out.println(reverse);
		return reverse;

	}

	private static int countNicePairs(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rev(nums[i]);
		}
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == nums[j] + nums[i]) {

					count++;
					System.out.println(count % 1000000007);

				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("C:/Users/Dell/eclipse-workspace/Book/input.txt"));
			scanner.hasNextLine();
			String[] arr =new String[100001];
			int i = 0; 
			String s = "";
			int k = 0;
			while(scanner.hasNextLine()){
			    s = scanner.nextLine();
			   String[] sp  = s.split(",");
			   i = 0;
			   int n = sp.length;
			   while(n-- > 0) {
				   arr[i] = sp[i];
				   k++;
				   i++;
				   }
			   
			}

			System.out.println(k);
			for(int j = 0; j <k; j++) {
				System.out.print(arr[j]);
				System.out.print(" "
						+ "");
			}
			
			
			scanner.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}

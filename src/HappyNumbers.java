
public class HappyNumbers {
	private static boolean isHappy(int n) {
		int sum = n;
		int count = 0;
		while (sum != 1) {
			n = sum;
			sum = 0;
			while (n != 0) {
				sum = sum + (n % 10) * (n % 10);
				n = n / 10;

			}
			if (++count == 31) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int x = 7;
		int y = 7;
		int sum = 0;
		for (int i = x; i <= y; ++i) {
			if (isHappy(i)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
}

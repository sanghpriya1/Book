
public class Weekly {
//	private static int gcd_iw(int Num1, int Num2) {
//		int Temp, gcd = 0;
//		while (Num2 != 0) {
//			Temp = Num2;
//			Num2 = Num1 % Num2;
//			Num1 = Temp;
//		}
//		gcd = Num1;
//		return gcd;
//}

	private static int findGCD(int a, int b) {
		if (b == 0)
			return a;
		return findGCD(b, a % b);
	}

	public static void main(String[] args) {
		int[] arr = { 18, 12, 30, 35, 63 };
		int x = 0;
		int count = 0;
		for (int i = 0; i < arr.length; ++i) {
			int y = arr[i];
			x = findGCD(y, x);
			count += x;
		}

		System.out.println(count);

	}

}

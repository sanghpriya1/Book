
public class SmallerNumbersThanCurrent {
	private static int Count_Ugly(long limit) {
		int count = 0;
		long x = 1;
		while (true) {
			long y = 1;
			while (true) {
				if (x > limit / y)
					break;
				long z = 1;
				while (true) {
					if (x * y > limit / z)
						break;
					++count;
					if (z > limit / 5)
						break;
					z = z * 5;
				}
				if (y > limit / 3)
					break;
				y = y * 3;
			}
			if (x > limit / 2)
				break;
			x = x * 2;
		}
		return count;
	}

//	private static int isfactor(int n, int x){
//        while(n%x == 0){
//            n= n/x;
//        }
//        return n;
//    }
//    private static boolean isUgly(int n) {
//        if(n <= 0)return false;
//        if(n == 1)return true;
//        n = Math.abs(n);
//        n = isfactor(n, 2);
//        
//        n = isfactor(n, 3);
//        
//        n = isfactor(n, 5);
//        if(n == 1)return true;
//        return false;
//        
//    }
	public static void main(String[] args) {
		int n = 9;
		long low = 1;
		long high = 200L;
		long ans = 0;
		while (low <= high) {
			long limit = low + (high - low) / 2;

			System.out.println(Count_Ugly(limit));
			if (Count_Ugly(limit) < n)
				low = limit + 1;

			if (Count_Ugly(limit) >= n) {
				ans = limit;
				high = limit - 1;
			}

		}

		System.out.println(ans);
//		int counts = 0;
//		for(int i = 0; i <= 1000000000; i++) {
//			if(isUgly(i))counts++;
//		}
//		System.out.println(counts);

	}

}

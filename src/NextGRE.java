
public class NextGRE {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		//int[] arr = new int[] {1,2,3,4,5,6,7,8};
		S.push(9);
		S.push(2);
		S.push(32);
		while(!S.isEmpty()) {
			int x = S.peek();
			System.out.println(x);
			S.pop();
		}
		
	}

}


public class trucncate {
	public static void main(String[] args) {
		String s = "What is the solution to this problem";
		int k = 4;
		String[] words = s.split("\\s");
		String ans = "";
		int i = 0;
		while(k-- > 0) {
			ans += words[i];
			i++;
			if(k != 0)
			ans += " ";
			
			
		}
		System.out.println(ans);
	}

}

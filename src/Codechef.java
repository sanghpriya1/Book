import java.util.Scanner;

public class Codechef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		double k1 = sc.nextDouble();
		double k2 = sc.nextDouble();
		double k3 = sc.nextDouble();
		double v = sc.nextDouble();
		v = k1*k2*k3*v;
		v = 100/v;
		v = Math.round(v*100)/100.0;
		
				
		
		
		if(v < 9.58)System.out.println("YES");
		else
		System.out.println("NO");
		
		}
		sc.close();
	}

}

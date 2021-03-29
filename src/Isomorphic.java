
public class Isomorphic {
	public static void main(String[] args) {
		int A = 1410065408;
		long ans = 0;
	    try {
	    	for (int i = 1; i <= A; i *= 10) { 
		        int divider = i * 10; 
		        
		        ans += (A / divider) * i +  Math.min(Math.max(A%divider - i + 1, 0), i); 
		    } 
			
		    System.out.println(ans);
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Error. Array is out of Bounds"+e);
	      } catch (ArithmeticException e) {
	         System.out.println ("Can't be divided by Zero"+e);
	      }
	}

}

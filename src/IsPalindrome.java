
public class IsPalindrome {
	public static void main(String[] args) {

		String s = "a ";
		int n = s.length();
        int x = 0;
        n = n-1;
        if(s.charAt(n) == ' ' && n > 0) {
        	n = n-1;
        	while(n >= 0 && s.charAt(n) != ' ') {
        		n--;
        		x++;
        		
        	}
        	
        }
        
        while(s.charAt(n) != ' '){
            n--;
            x++;
            if(n<0)break;
            
        }
        
        System.out.println(x); 
        
		
		
	}

}

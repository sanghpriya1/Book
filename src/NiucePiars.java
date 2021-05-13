

public class NiucePiars {
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 9;
		int x = target;
        int[] arr = new int[2];
        int len = numbers.length;
        
        for(int i = len-1; i >= 1; i--){
            
                x = x -numbers[i];
                for(int j = i-1; j >=0; j--){
                    if(numbers[j] == x)
                    {
                        arr[0] = j+1;
                        arr[1] = i+1;
                        break;
                    }
                    
                }
            
            
        }	
        System.out.println(arr[0] + " " + arr[1]);
			}
}

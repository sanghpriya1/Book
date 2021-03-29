
public class Queue<T> {
	int enqueIndex;
	int dequeIndex;
	int[] arr = new int[4];
	boolean isEmpty() {
		if(dequeIndex == -1)return true;
		return false;
	}
	
	void enque( int x) {
		if(enqueIndex == 4)System.out.println("Queue is full");
		else {
			arr[enqueIndex++] = x;
		}
		
	}
	int poll() {
		if(dequeIndex == -1) 
			System.out.println("Queue is empty");
			
	
		
			return arr[dequeIndex];
		
	}
	void deque() {
		if(dequeIndex == -1)System.out.println("Underflow error");
		else {
			dequeIndex++;
		}
	}
	

}

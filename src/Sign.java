
  class ListNode {
         int val;
         ListNode next;
        ListNode(int x) { val = x; }
      }



public class Sign {
	
	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		ListNode node = new ListNode(1);
		ListNode head = node;
		for(int i = 2; i <= n; ++i) {
			ListNode nodex = new ListNode(i);
			node.next = nodex;
			node = node.next;
		}
		
		
		node.next = head;
		ListNode temp = head;
		while(n-- > 1) {
			int a = k-1;
			 
			while(a-- > 1) {
				temp = temp.next;
				
			}
			ListNode temp2 = temp.next;
			temp.next = temp2.next;
			temp = temp.next;
			temp2.next = null;
			
			
			
		}
		System.out.println(temp.val);
		
		

	}
}

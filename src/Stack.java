
public class Stack<T> {
	int top;
    int items[] = new int[100];

    
    void push(int x)
    {
        if (top == 100) 
        {
            System.out.println("Stack full");
        }
        else
        {
            items[top++] = x;
        }
    }
    
    
    int pop()
    {
        if (top == 0) 
        {
            System.out.println("Underflow error");
            return -1;
        }
        else {
            int element = items[--top];
            
            return element;
        }

    }
    int peek() {
    	if(isEmpty())System.out.println("Underflow error");
    	return items[top-1];
    }
    boolean isEmpty() {
    	if(top == 0)return true;
    	return false;
    }
    }

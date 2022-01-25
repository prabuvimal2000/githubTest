package datastruct;

public class StackExample
{
	static final int MAX = 10;
    int top;
    int array[] = new int[MAX]; // Maximum size of Stack
    StackExample()
    {
        top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
    	return top == (MAX - 1);
    }
    public boolean push(int x)
    {
        if (isFull())
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else 
        {
            array[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
    public int pop()
    {
        if (isEmpty()) 
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = array[top--];
            return x;
        }
    }
 
    public int peek()
    {
        if (isEmpty()) 
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else 
        {
            int x = array[top];
            return x;
        }
    }
    public static void main(String args[])
    {
        StackExample stack = new StackExample();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(45);
        stack.push(58);
        stack.push(62);
        stack.push(40);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(85);
        System.out.println(stack.pop() + " Popped element from stack");
        System.out.println(stack.peek()+" Peek element from stack");
    }
}

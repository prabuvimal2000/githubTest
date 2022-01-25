package datastruct;
public class Queue {
	private int front, rear;
	final static int capacity=10;
    private static int[] queue = new int [capacity];
  
    Queue()
    {
        front = rear = -1;
    }
    public void queueEnqueue(int data)
    {
        if (rear==capacity-1) 
        {
            System.out.println("Queue is Full");
            return;
        }
        else 
        {
            queue[++rear]=data;
        }
    }
    public void queueDequeue()
    {
        if (front == rear)
        {
            System.out.println("Queue is empty");
            return;
        }
        else 
        {
            for (int i = 0; i <= rear ; i++) 
            {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
            {
                queue[rear] = 0;
            }
            rear--;
        }
    }
    public void queueDisplay()
    {
        if (front == rear)
        {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (int i : queue) 
        {
            System.out.println(i);
        }
    }
    public void queueFront()
    {
        if (front == rear) 
        {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front+1]);
    }
    public static void main(String[] args)
    {
        Queue que = new Queue();
        que.queueDisplay();
        que.queueEnqueue(20);
        que.queueEnqueue(30);
        que.queueEnqueue(40);
        que.queueEnqueue(50);
        que.queueDisplay();
        que.queueEnqueue(60);
        que.queueDisplay();
        que.queueDequeue();
        que.queueDisplay();
        que.queueFront();
    }
}


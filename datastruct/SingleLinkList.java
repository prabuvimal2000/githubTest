package datastruct;
public class SingleLinkList 
{
	 Node head; 
	 class Node
	 {
	     int data;
	     Node next;
	        Node(int data)
	        {
	        	this.data = data; 
	        	next = null; 
	        }
	  }
	 public void pushInFront(int new_data)
	 {
	     Node new_node = new Node(new_data);
	     new_node.next = head;
	     head = new_node;
	 }
	 public void appendLast(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        if (head == null)
	        {
	            head = new Node(new_data);
	            new_node.next = null;
	        }
	        else
	        {
	        Node last = head;
	          while (last.next != null)
	          {
	            last = last.next;
	          }
	        last.next = new_node;
	        }
	    }
	 
	 public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data+" ");
	            tnode= tnode.next;
	        }
	    }
	 public static void main(String[] args)
	    {
		 SingleLinkList  list = new SingleLinkList ();
		    list.pushInFront(17);
		    list.appendLast(20);
		    list.appendLast(18);
	        list.pushInFront(7);
	        list.pushInFront(8);
	        list.pushInFront(10);
	        list.appendLast(15);
	        System.out.println("Your linked list is: ");
	        list.printList();
	    }
}

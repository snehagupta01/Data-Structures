package com;

// reverse Alternate K nodes of Linked List
public class sll12 {
	static Node head=null;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public void addInFront(int val)
	{
		Node n=new Node(val);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	public void displaysll()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		
		sll12 l=new sll12();
		l.addInFront(10);
		l.addInFront(8);
		l.addInFront(6);
		l.addInFront(4);
		l.addInFront(2);
		l.addInFront(0);
		Node t=revAltKNodes(head,2);
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
	  static Node revAltKNodes (Node head, int k) {
			Node prev = null; 
		    Node curr = head; 
		    Node temp = null; 
		    Node tail = null; 
		    Node newHead = null; 
		    Node join = null; 
		    int t = 0; 
		     while (curr != null)  
		    { 
		        t = k; 
		        join = curr; 
		        prev = null; 
		  
		        while (curr != null && t-- >0)  
		        { 
		            temp = curr.next; 
		            curr.next = prev; 
		            prev = curr; 
		            curr = temp; 
		        } 
		  
		        
		        if (newHead == null) 
		            newHead = prev; 
		  
		        if (tail != null) 
		            tail.next = prev; 
		  
		        tail = join; 
		        tail.next = curr; 
		  
		        t = k; 
		  
		        while (curr != null && t-- >0) 
		        { 
		            prev = curr; 
		            curr = curr.next; 
		        } 
		  
		        tail = prev; 
		    } 
		    return newHead; 
		  }
}

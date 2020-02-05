package com;

//reverse a sll
public class sll10 {
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
		
		sll10 l=new sll10();
		l.addInFront(10);
		l.addInFront(8);
		l.addInFront(6);
		l.addInFront(4);
		l.addInFront(2);
		//l.displaysll();
		Node r=reverseList(head);
		head=r;
		l.displaysll();
	}
	static Node reverseList(Node head) {
		Node prev=null,current=head,next=null,org;
	    while(current!=null)
	    {
	      next=current.next;
	      current.next=prev;
	      prev=current;
	      current=next;
	    }
	    org=prev;
	    return org;
	  }
}

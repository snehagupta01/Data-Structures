package com;
//print the list frwd & bckwrd
public class sll7 {
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
		
		sll7 l=new sll7();
		l.addInFront(10);
		l.addInFront(8);
		l.addInFront(6);
		l.addInFront(4);
		l.addInFront(2);
		//l.displaysll();
		System.out.println("Forward Printing : ");
		forwardPrint(head);
		System.out.println("\nBackward Printing : ");
		backwardPrint(head);
	}
	public static void forwardPrint(Node h)
	{
		if(h!=null)
		{
			System.out.print(h.data+" ");
			forwardPrint(h.next);
		}
	}
	static void backwardPrint(Node h)
	{
		if(h!=null)
		{
			backwardPrint(h.next);
			System.out.print(h.data+" ");
		}
	}
}

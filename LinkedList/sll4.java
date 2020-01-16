package com;
//add node in the last
public class sll4 {
	Node head=null;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void addAtEnd(int val)
	{
		Node n=new Node(val);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node x=head;
			while(x.next!=null)
			{
				x=x.next;
			}
			x.next=n;
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
	public static void main(String args[])
	{
		sll4 l=new sll4();
		l.addAtEnd(2);
		l.addAtEnd(4);
		l.addAtEnd(6);
		l.displaysll();
	}
}

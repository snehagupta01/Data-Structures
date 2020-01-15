package com;
//traversing singlylinkedlist
public class sll2 {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void main(String args[])
	{
		sll2 l=new sll2();
		l.head=new Node(2);
		Node n2=new Node(4);
		Node n3=new Node(6);
		l.head.next=n2;
		n2.next=n3;
		
		l.displaysll();
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
}

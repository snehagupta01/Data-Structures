package com;

public class sll1 {
Node head;
static class Node//static so that sll1 can access it
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
	sll1 l=new sll1();
	l.head=new Node(1);
	Node n2=new Node(2);
	Node n3=new Node(3);
	
	l.head.next=n2;
	n2.next=n3;
	//System.out.println("hi");
}
}

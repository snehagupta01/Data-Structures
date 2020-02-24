package com;


public class cll1 {
	static LinkList head=null;
	class LinkList
	{
		int data;
		LinkList next;
		LinkList(int d)
		{
			data=d;
			next=null;
		}
	}
public void traverse()
{
	LinkList r=head;
	if(r!=null)
	{
		do
		{
			System.out.print(r.data+" ");
			r=r.next;
		}
		while(r!=head);
	}
}
public void insertBeg(int x)
{
	LinkList l=new LinkList(x);
	if(head==null)
	{
		l.next=l;
		head=l;
	}
	else
	{
		LinkList r=head;
		while(r.next!=head)
		{
			r=r.next;
		}
		r.next=l;
		l.next=head;
		head=l;
	}
}
public static void main(String[] args) {
		
		cll1 l=new cll1();
		l.insertBeg(2);
		l.insertBeg(4);
		l.insertBeg(20);
		l.insertBeg(40);
		l.traverse();
	}
}

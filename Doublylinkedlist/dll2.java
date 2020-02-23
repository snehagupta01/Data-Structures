package com;


public class dll2
{
	static LinkList head=null;
	class LinkList
	{
		int data;
		LinkList next;
		LinkList prev;
		LinkList(int d)
		{
			data=d;
			prev=null;
			next=null;
		}
	}
	public void insertAtEnd(int x)
	{
		LinkList n=new LinkList(x);
		if(head==null)
		{
			head=n;
		}
		else
		{
			LinkList r=head;
			while(r.next!=null)
			{
				r=r.next;
			}
			r.next=n;
			n.prev=r;
		}
	}
	public void display()
	{
		LinkList r;
		r=head;
		while(r!=null)
		{
			System.out.print(r.data+" ");
			r=r.next;
		}
	}
public static void main(String[] args) {
		
		dll2 l=new dll2();
		l.insertAtEnd(2);
		l.insertAtEnd(4);
		l.insertAtEnd(6);
		l.insertAtEnd(8);
		l.insertAtEnd(10);
		l.display();
	}
}

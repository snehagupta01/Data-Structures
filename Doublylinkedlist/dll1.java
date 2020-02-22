package com;


public class dll1
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
	public void insertBeg(int x)
	{
		LinkList n=new LinkList(x);
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
		
		dll1 l=new dll1();
		l.insertBeg(2);
		l.display();
		System.out.println();
		l.insertBeg(4);
		l.display();
		
	}
}

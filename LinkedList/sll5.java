package com;

//add a node at specific position 
//list: 2 4 6 8 --0 1 2 3
//add(3,1)//val pos
//2 3 4 6 8
public class sll5 {
	Node head;
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
	public void addatEnd(int val)
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
	public void addAt(int data,int pos)
	{
		Node n=new Node(data);
		if(pos==0)
		{
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
		else
		{
			int size=0;
			Node x=head;
			while(x!=null)
			{
				size++;
				x=x.next;
			}
			if(pos>size)
			{
				System.out.print("can't be inserted");
			}
			else
			{
				int i;
				Node y=head;
				for(i=0;i<pos-1;i++)
				{
					y=y.next;
				}
				n.next=y.next;
				y.next=n;
			}
		}
	}
	public static void main(String[] args) 
	{
		sll5 l=new sll5();
		l.addatEnd(2);
		l.addatEnd(4);
		l.addatEnd(6);
		
		l.addAt(3,1);
		l.addAt(0,0);
		l.addAt(2, 1);
		l.displaysll();
	}

}

package com;
//delete the first occurence of the given key
public class sll6 {

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
	public void delete(int key)
	{
		Node n=head;
		Node prev=null,curr=null;
		int i=0,f=0;
		while(n!=null)
		{
			if(n.data==key)
			{
				if(i==0)
				{
					head=head.next;
				}
				else
				{
					f=1;
				}
				break;
			}
			else
			{
				prev=n;
				curr=n.next;
			}
			i++;
			n=n.next;
		}
		if(f==1)
		{
			prev.next=curr.next;
		}
	}
	public static void main(String args[])
	{
		sll6 l=new sll6();
		l.addatEnd(2);
		l.addatEnd(4);
		l.addatEnd(6);
		l.addatEnd(8);
		l.addatEnd(10);
		l.addatEnd(10);
		l.delete(10);
		
		l.displaysll();
	}

}

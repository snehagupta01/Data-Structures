package com;
//Copy first list to second list
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
	}
}
public class sll8 {
	static Node head=null;
	
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
		
		sll8 l=new sll8();
		l.addInFront(10);
		l.addInFront(8);
		l.addInFront(6);
		l.addInFront(4);
		l.addInFront(2);
		//l.displaysll();
		Node t=copyList(head);
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
	
	static Node copyList(Node org)
	{
	  if(org==null)
	  {
	    return null;
	  }
		Node h=null,ref=null;
	  	while(org!=null)
	    {
	      Node n=new Node(org.data);
	      if(h==null)
	      {
	        h=n;
	        h.next=null;
	      }
	      else
	      {
	        ref=h;
	        while(ref.next!=null)
	        {
	          ref=ref.next;
	        }
	        ref.next=n;
	      }
	      org=org.next;
	    }
	  return h;
	}
}

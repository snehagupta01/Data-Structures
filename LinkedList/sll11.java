package com;


public class sll11{
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
		
		sll11 l=new sll11();
		l.addInFront(10);
		l.addInFront(8);
		l.addInFront(6);
		l.addInFront(4);
		l.addInFront(2);
		int r=l.checkPalindrome(head);
		if(r==1)
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.print("Not Palindrome");
		}
	}
	static int checkPalindrome(Node head) {
		Node org=head;
	    int size=0;
	    while(org!=null)
	    {
	      org=org.next;
	      size++;
	    }
	    if(size==0)
	    {
	      return 0;
	    }
	    //System.out.print("s"+size);
	    int k,j,s=0,e=0,i,fg=0;
	    for(i=0;i<=(size/2);i++)
	    {
	      org=head;
	      fg=0;
	      for(k=0;k<=i;k++)
	      {
	        s=org.data;
	        org=org.next;
	      }
	      org=head;
	      for(j=0;j<=(size-1-i);j++)
	      {
	        e=org.data;
	        org=org.next;
	      }
	      if(s==e)
	      {
	        fg=1;
	      }
	      else
	      {
	        fg=0;
	        break;
	      }
	    }
	    if(fg==1)
	    {
	      return 1;
	    }
	    else
	    {
	      return 0;
	    }
	    //return 0;
	  }
	
}

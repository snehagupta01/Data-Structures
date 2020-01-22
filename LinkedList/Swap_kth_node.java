package com;

public class Swap_kth_node {

	class node{
	    node next;
	    int data;
	    public node(int d)
	    {
	        data=d;
	        next=null;
	    }
	}
	public static node head=null;
	public static node tail=null;
	public static node ref=null;
	public node current=null;
	public node pos1=null;
	public node pos2=null;
	public node prev1=null;
	public node prev2=null;
	public void add(int n)
	{
	    node newnode=new node(n);
	    if(head==null)
	    {
	        head=newnode;
	        tail=newnode;
	    }
	    else{
	        tail.next=newnode;
	        tail=newnode;
	    }
	}
	public void add(int d,int n)
	{
//		System.out.println("kdnkl"+head.data);
		if(head==null)
		{
			System.out.println("Linked List is empty");
		}
		else {
			int size=0;
			current=head;
			while(current!=null)
			{
				current=current.next;
				size++;
			}
			//System.out.println("size"+size);
		
			if(size<n)
			{
				System.out.println("can't be added");
			}
			else {
				current=head;
				for(int i=1;i<n-1;i++)
				{
					current=current.next;
				}
				
				node newnode=new node(d);
				ref=current.next;
				
				current.next=newnode;
				newnode.next=ref;	
			}	
		}
	}
	public void display()
	{
	    current=head;
	    if(current==null)
	    {
	        System.out.print("empty list");
	    }
	    else{
	        while(current!=null)
	        {
	            System.out.print(current.data+" ");
	            current=current.next;
	        }
	    }
	}
	public void swap(int n) {
		if(head==null)
		{
			System.out.print("Linked list is empty");
		}
		else
		{
			current=head;
			int size=0;
			while(current!=null)
			{
				current=current.next;
				size++;
			}
			//System.out.println("sg"+size);
			if(size<n)
			{
				System.out.print("can't swap k is greater than size");
			}
			else if(n==1)
			{
				node r=head,r1=head.next,p=null;
				while(r.next!=null)
				{
					p=r;
					r=r.next;
				}
//				System.out.print("p lll :"+p.data);//700
//				System.out.print("r lll :"+r.data);//800
				head.next=null;
				p.next=head;
				r.next=r1;
				head=r;
			}
			else{
				
				prev1=head;
					for(int i=1;i<n-1;i++)
					{
						prev1=prev1.next;
					}
					pos1=prev1.next;
					//System.out.println("check"+pos1.data);
					prev2=head;
					//System.out.println("check"+pos2.data);
	//				System.out.println("sg"+size);
					for(int i=0;i<size-n-1;i++)
					{
						prev2=prev2.next;
						
					}
					pos2=prev2.next;
					//System.out.println("check"+prev2.data);
				//now swapping
				prev1.next=pos2;
				current=pos1.next;
				pos1.next=pos2.next;
				pos2.next=current;
				prev2.next=pos1;
					
					
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap_kth_node li=new Swap_kth_node();
		li.add(1);
	    li.add(2);
	    li.add(3);
	    li.add(4);
	    li.add(5);
	    li.add(6);
	    li.add(7);
	    li.add(8);
	    
	    li.swap(1);
	    li.display();
	}

}

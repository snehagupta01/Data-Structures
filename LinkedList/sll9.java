package com;
//Move the Smallest and largest to head and tail of list
public class sll9 {
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
		
		sll9 l=new sll9();
		l.addInFront(10);
		l.addInFront(-8);
		l.addInFront(6);
		l.addInFront(400);
		l.addInFront(2);
		Node y=shiftSmallLarge(head);
		while(y!=null)
		{
			System.out.print(y.data+" ");
			y=y.next;
		}
		
	}
static Node prev1=null;
static Node pos1=null;
static Node pos2=null;
static Node prev2=null;
static Node current=null;
static Node shiftSmallLarge(Node org)
{
	int small=0;
  	int large=0;
  	
  int k1=0;
  int p1=1;
  int p2=1;
  int k2=0;
  //System.out.print(k1);
  
  if(org!=null)
  {
    current=org;
  small=current.data;
    int size=0;
    Node ref=org;
    while(ref!=null)
    {
      size++;
      ref=ref.next;
    }
  	while(current!=null)
    {
      
      if(small>current.data)
      {
        small=current.data;
        k1=p1;
      }
      current=current.next;
      p1++;
    }
    prev1=org;
					
    
      if(k1!=0)
          {
        for(int i=1;i<k1-1;i++)
					{
						prev1=prev1.next;
					}
        	pos1=prev1.next;
        	prev1.next=pos1.next;
        	pos1.next=org;
        	org=pos1;
      		}
      
    current=org;
  large=current.data;
  	while(current!=null)
    {
      
      if(large<current.data)
      {
        large=current.data;
        k2=p2;
      }
      current=current.next;
      p2++;
    }
    
        	
    
    //System.out.println("check"+pos1.data);
					prev2=org;
					//System.out.println("check"+pos2.data);
					//System.out.println("sameer"+size);
					
					if(k2!=size)
					{
                    for(int i=1;i<k2-1;i++)
					{
						prev2=prev2.next;
						
					}
                     pos2=prev2.next;
                      if(pos2!=null)
                     prev2.next=pos2.next;
                      else
                        prev2.next=null;
                      if(pos2!=null)
                       pos2.next=null;
                      ref=org;
                      while(ref.next!=null)
                      {
                        ref=ref.next;
                      }
                      ref.next=pos2;
                    }
					
 //System.out.print("small : "+small+" pos :"+k1);
    return org;
  }
  
  return null;
					
}

}

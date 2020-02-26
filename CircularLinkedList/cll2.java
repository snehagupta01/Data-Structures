//inserting at the end of cll
public class cll2 {
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
public void insertEnd(int x)
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
		
	}
}
public static void main(String[] args) {
		
		cll2 l=new cll2();
		l.insertEnd(2);
		l.insertEnd(4);
		l.insertEnd(20);
		l.insertEnd(40);
		l.traverse();
	}
}

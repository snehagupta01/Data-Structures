//binary tree from array iteratively
import java.util.*;

public class t17 {
	static class Treenode
	{
		int data;
		Treenode left,right;
		Treenode(int d)
		{
			data=d;
			left=right=null;
		}
	}
	static Treenode root=null;
	private static void constructiteratively(int a[],int len)
	{
		int i;
		for(i=0;i<len;i++)
		{
			Treenode t=new Treenode(a[i]);
			if(root==null)
			{
				root=t;
			}
			else
			{
				ArrayDeque<Treenode> q=new ArrayDeque<Treenode>();
				Treenode curr=root;
				while(curr!=null)
				{
					if(curr.left==null)
					{
						curr.left=t;
						break;
					}
					else
					{
						q.add(curr.left);
					}
					if(curr.right==null)
					{
						curr.right=t;
						break;
					}
					else
					{
						q.add(curr.right);
					}
					curr=q.poll();
				}
			}
		}
		levelorder();
	}
	private static void levelorder()
	{
		ArrayDeque<Treenode> q=new ArrayDeque<Treenode>();
		if(root==null)
		{
			return;
		}
		else
		{
			Treenode curr=root;
			q.add(curr);
			curr=q.poll();
			while(curr!=null)
			{
				System.out.print(curr.data+" ");
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
				curr=q.poll();
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		constructiteratively(a,a.length);
	}

}

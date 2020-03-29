import java.util.*;

//construct a binary tree from array recursively
public class t16 {
	static Treenode root=null;
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
	private static void constructbt(int a[],int n)
	{
		root=null;
		root=con(a,0,n,root);
		levelorder();
	}
	private static Treenode con(int a[],int ind,int n,Treenode t)
	{
		if(ind<n)
		{
			Treenode n1=new Treenode(a[ind]);
			t=n1;
			t.left=con(a,2*ind+1,n,t.left);
			t.right=con(a,2*ind+2,n,t.right);
		}
		return t;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		constructbt(a,a.length);
	}

}

//insertion in a binary tree in level order
import java.util.*;
public class t14 {
	static Treenode root;
	static class Treenode
	{
		int data;
		Treenode left;
		Treenode right;
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
	private static void insertlevelorder(int x)
	{
		Treenode t=new Treenode(x);
		if(root==null)
		{
			root=t;
			return;
		}
		ArrayDeque<Treenode> q=new ArrayDeque<Treenode>();
		Treenode curr=root;
		q.add(root);
		curr=q.poll();
		while(curr!=null)
		{
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			else
			{
				curr.left=t;
				break;
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
			else
			{
				curr.right=t;
				break;
			}
			curr=q.poll();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root=new Treenode(1);
		root.left=new Treenode(2);
		root.right=new Treenode(3);
		root.left.left=new Treenode(4);
		root.right.right=new Treenode(5);
		System.out.print("Initially : \n");
		levelorder();
		insertlevelorder(6);
		System.out.print("\nAfter inserting 6 : \n");
		levelorder();
		insertlevelorder(7);
		System.out.print("\nAfter inserting 7 : \n");
		levelorder();
	}

}

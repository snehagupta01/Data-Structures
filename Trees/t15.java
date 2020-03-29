import java.util.*;
//deletion in a binary tree
//here replace the data part of the node to be deleted with the deepest node and then
//delete the deepest node
public class t15 {
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
	private static void delete(int val)
	{
		Treenode key_to_be_deleted=null;
		int fg=0;
		if(root==null)
		{
			System.out.print("The given key doesn't exist");
			return;
		}
		else if(root.left==null&&root.right==null)
		{
			if(root.data==val)
			{
				root=null;
			}
		}
		else
		{
			ArrayDeque<Treenode> q=new ArrayDeque<Treenode>();
			Treenode deepest=null,curr=root;
			while(curr!=null)
			{
				if(curr.data==val&&fg==0)
				{
					key_to_be_deleted=curr;
					fg=1;
				}
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
				deepest=curr;
				curr=q.poll();
			}
			if(key_to_be_deleted!=null)
			{
				int x=deepest.data;
				deletedeepest(deepest);
				key_to_be_deleted.data=x;
			}
		}
	}
	private static void deletedeepest(Treenode deepest)
	{
		ArrayDeque<Treenode> q=new ArrayDeque<>();
		Treenode curr=root;
		while(curr!=null)
		{
			if(curr.left!=null)
			{
				if(curr.left==deepest)
				{
					curr.left=null;
					break;
				}
				else
				{
					q.add(curr.left);
				}
			}
			if(curr.right!=null)
			{
				if(curr.right==deepest)
				{
					curr.right=null;
					break;
				}
				else
				{
					q.add(curr.right);
				}
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
		delete(2);
		System.out.print("\nAfter deleting 2 : \n");
		levelorder();
	}

}

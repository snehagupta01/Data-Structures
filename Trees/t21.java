import java.util.*;
public class t21 {
	static int postind=0;
	public static void levelorder(treenode root)
	{
		ArrayDeque<treenode> queue=new ArrayDeque<treenode>();
		treenode temp=root;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{
				queue.add(temp.left);
			}
			if(temp.right!=null)
			{
				queue.add(temp.right);
			}
			temp=queue.poll();
		}
		
	}
	static class treenode
	{
		int data;
		treenode left,right;
		treenode(int d)
		{
			data=d;
			left=right=null;
		}
	}
	public static void main(String args[])
	{
		int in[]=new int[] {4,8,2,5,1,6,3,7};
		int post[]=new int[] {8,4,5,2,6,7,3,1};
		int len=in.length;
		postind=len-1;
		treenode root=buildtree(in,post,0,len-1);
		levelorder(root);
	}
	public static treenode buildtree(int in[],int post[],int instart,int inend)
	{
		if(instart>inend)
		{
			return null;
		}
		treenode tt=new treenode(post[postind--]);
		if(instart==inend)
		{
			return tt;
		}
		int inind=search(in,tt.data,instart,inend);
		tt.right=buildtree(in,post,inind+1,inend);
		tt.left=buildtree(in,post,instart,inind-1);
		return tt;
	}
	public static int search(int in[],int val,int instart,int inend)
	{
		int i=0;
		for(i=instart;i<=inend;i++)
		{
			if(in[i]==val)
			{
				return i;
			}
		}
		return i;
	}
}
	


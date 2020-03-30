import java.util.ArrayDeque;

//construct tree from inorder and preorder traversal

public class t20 {
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
	static int preindex=0;
	static Treenode buildtree(char in[],char pre[],int instart,int inend)
	{
		if(instart>inend)
		{
			return null;
		}
		Treenode tt=new Treenode(pre[preindex++]);
		if(instart==inend)
		{
			return tt;
		}
		int inindex=search(in,instart,inend,tt.data);
		tt.left=buildtree(in,pre,instart,inindex-1);
		tt.right=buildtree(in,pre,inindex+1,inend);
		return tt;
	}
	private static int search(char in[],int instart,int inend,int data)
	{
		int i=0;
		for(i=instart;i<=inend;i++)
		{
			if(in[i]==data)
			{
				return i;
			}
		}
		return i;
	}
	public static void levelorder(Treenode root)
	{
		ArrayDeque<Treenode> queue=new ArrayDeque<Treenode>();
		Treenode temp=root;
		while(temp!=null)
		{
			System.out.print((char)temp.data+" ");
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char in[]= new char[]{'d','b','e','a','f','c'};
		char pre[]= new char[]{'a','b','d','e','c','f'};
		int len=in.length;
		Treenode root=buildtree(in,pre,0,len-1);
		levelorder(root);
	}

}

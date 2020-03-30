
//printing nodes at odd levels of binary tree
public class t19 {
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
	static void printodd()
	{
		int h=height(root);
		int i;
		for(i=1;i<=h;i+=2)
		{
			print(root,i);
		}
	}
	static void print(Treenode r,int l)
	{
		if(r==null)
		{
			return;
		}
		else if(l==1)
		{
			System.out.print(r.data+" ");
		}
		else if(l>1)
		{
			print(r.left,l-1);
			print(r.right,l-1);
		}
	}
	static int height(Treenode root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int lh=height(root.left);
			int rh=height(root.right);
			if(lh<rh)
			{
				return rh+1;
			}
			else
			{
				return lh+1;
			}
		}
	}
	public static void main(String[] args) {
		root=new Treenode(1);
		root.left=new Treenode(2);
		root.right=new Treenode(3);
		root.left.left=new Treenode(4);
		root.left.right=new Treenode(5);
		root.right.left=new Treenode(6);
		root.right.right=new Treenode(7);
		printodd();
	}

}

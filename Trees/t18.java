//level order traversal recursively
public class t18 {
	static Treenode root=null;
	static String str="";
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
	private static void printLevelwise()
	{
		int h=height(root);
		for(int i=1;i<=h;i++)
		{
			print(root,i);
			str.trim();
			str+="\n";
		}
		System.out.print(str);
	}
	private static void print(Treenode root,int l)
	{
		if(root==null)
		{
			return;
		}
		if(l==1)
		{
			str+=root.data+" ";
		}
		else if(l>1)
		{
			print(root.left,l-1);
			print(root.right,l-1);
		}
	}
	private static int height(Treenode root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int lh=height(root.left);
			int rh=height(root.right);
			if(lh>rh)
			{
				return lh+1;
			}
			else
			{
				return rh+1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root=new Treenode(1);
		root.left=new Treenode(2);
		root.right=new Treenode(3);
		root.left.left=new Treenode(4);
		root.left.right=new Treenode(5);
		root.right.left=new Treenode(6);
		root.right.right=new Treenode(7);
		printLevelwise();
	}

}

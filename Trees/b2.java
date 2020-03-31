//insertion in bst
public class b2 {
	
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
	public static treenode insert(treenode root,int val)
	{
		if(root==null)
		{
			treenode r=new treenode(val);
			return r;
		}
		if(val<root.data)
		{
			root.left=insert(root.left,val);
		}
		else
		{
			root.right=insert(root.right,val);
		}
		return root;
	}
	public static void main(String[] args) {
		  treenode root=null;
		  root = insert(root, 25);
		  root = insert(root, 15);
		  root = insert(root, 50);
		  root = insert(root, 10);
		  root = insert(root, 22);
		  root = insert(root, 35);
		  root = insert(root, 70);
		  inorder(root);
	}
	public static void inorder(treenode root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

}

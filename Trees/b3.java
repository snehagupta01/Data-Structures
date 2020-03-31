//deletion in bst(inorder successor)
//finding minvalue in right subtree
public class b3 {
	static class treenode
	{
		int data;
		treenode right,left;
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
		  treenode root = null;
		  root = insert(root, 25);
		  root = insert(root, 15);
		  root = insert(root, 50);
		  root = insert(root, 10);
		  root = insert(root, 22);
		  root = insert(root, 35);
		  root = insert(root, 70);
		  inorder(root);
		  System.out.println();
		  root=delete(root,22);
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
	public static treenode delete(treenode root,int key)
	{
		if(root==null)
		{
			System.out.print("Node not found");
			return null;
		}
		if(key<root.data)
		{
			root.left=delete(root.left,key);
		}
		else if(key>root.data)
		{
			root.right=delete(root.right,key);
		}
		else//root.data==key
		{
			treenode temp=null;
			if(root.left==null&&root.right==null)
			{
				return null;
			}
			else if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			temp=minvalnode(root.right);
			root.data=temp.data;
			root.right=delete(root.right,temp.data);
		}
		return root;
	}
	public static treenode minvalnode(treenode root)
	{
		treenode curr=root;
		while(curr.left!=null)
		{
			curr=curr.left;
		}
		return curr;
	}
}

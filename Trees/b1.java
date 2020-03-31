//search in bst
public class b1 {
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
	public static void main(String[] args) {
		treenode root=new treenode(10);
		root.left=new treenode(5);
		root.left.left=new treenode(2);
		root.left.right=new treenode(6);
		root.right=new treenode(15);
		root.right.left=new treenode(12);
		root.right.right=new treenode(17);
		int key=8;
		treenode rr=search(root,key);
		if(rr==null)
		{
			System.out.print("node with value "+ key +" doesn't exist");
		}
		else
		{
			System.out.print("node with value "+ key +" found");
		}
	}
	public static treenode search(treenode root,int val)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==val)
		{
			return root;
		}
		if(root.data<val)
		{
			return search(root.right,val);
		}
		return search(root.left,val);
	}
}

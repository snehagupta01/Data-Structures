//no of leaf nodes recursively
public class t12 {
	static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int d)
		{
			data=d;
		}
	}
	private static int leafnodes(TreeNode root)
	{
		
		if(root==null)
		{
			return 0;
		}
		else if((root.left==null)&&(root.right==null))
		{
			return 1;
		}
		else
		{
			int ln=leafnodes(root.left);
			int rn=leafnodes(root.right);
			return ln+rn;
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);	
		int ans=leafnodes(root);
		System.out.print("No of nodes :"+ans);
	}

}

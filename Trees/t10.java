
//no of nodes in binary tree recursively
public class t10 {
	public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int d)
		{
			data=d;
			left=right=null;
		}
	}
	private static int countnoofnodes(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int ln=countnoofnodes(root.left);
			int rn=countnoofnodes(root.right);
			return (ln+rn+1);
		}
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		root.left.left.left=new TreeNode(8);
		root.left.left.right=new TreeNode(9);
		int n=countnoofnodes(root);
		System.out.print(n+" ");
	}

}

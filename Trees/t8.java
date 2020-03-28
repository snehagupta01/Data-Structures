//height of binary tree
//time complexity - o(n)
//space complexity - o(n)
public class t8 {
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
	public static int height(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int lh=height(root.left);
			int rh=height(root.right);
			int max=Math.max(lh, rh);
			return max+1;
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
		int h=height(root);
		System.out.print("height :"+h);
	}

}

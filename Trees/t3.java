//depthfirst traversal - postorder traversal of binary tree
public class t3 {

	static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	static void postorder(TreeNode root) {
		//root left right
		if(root==null)
		{
			return;
		}
		else
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
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
		postorder(root);
	}

}

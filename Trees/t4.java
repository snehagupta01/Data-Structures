import java.util.*;
//breadth first traversal- level order traversal 

public class t4 {
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
	public static void levelorder(TreeNode root)
	{
		ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
		TreeNode temp=root;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
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
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		levelorder(root);
	}
	
}

//inorder traversal iterative
import java.util.*;
public class t5 {

	 static class TreeNode
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
	static void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			Stack<TreeNode> s=new Stack<TreeNode>();
			TreeNode curr=root;
			while(curr!=null || s.size()>0)
			{
				while(curr!=null)
				{
					s.push(curr);
					curr=curr.left;
				}
				curr=s.pop();
				System.out.print(curr.data+" ");
				curr=curr.right;
			}
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
		inorder(root);
	}

}

import java.util.*;
//post order traversal using 2 stack
public class t7 {

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
	public static void postorder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode> s1=new Stack<TreeNode>();
		Stack<TreeNode> s2=new Stack<TreeNode>();
		TreeNode curr=root;
		while(curr!=null||s1.size()>0)
		{
			if(curr!=null)
			{
				s1.push(curr);
				s2.push(curr);
				curr=curr.right;
			}
			else
			{
				curr=s1.pop();
				curr=curr.left;
			}
		}
		while(s2.size()>0)
		{
			System.out.print(s2.pop().data+" ");
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
		postorder(root);
	}

}

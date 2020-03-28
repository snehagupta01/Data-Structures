import java.util.*;

//no of nodes in binary tree iterative way using queue
public class t9 {
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
	private static void countnoofnodes(TreeNode root) {
		
		if(root==null)
		{
			return;
		}
		else
		{
			int ct=0;
			TreeNode curr=root;
			ArrayDeque<TreeNode> q=new ArrayDeque<TreeNode>();
			//q.add(curr);
			while(curr!=null)
			{
				ct++;
				//System.out.print(curr.data+" ");
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
				curr=q.poll();
			}
			System.out.print("No of nodes in binary tree : "+ct);
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
		root.left.left.left=new TreeNode(8);
		root.left.left.right=new TreeNode(9);
		countnoofnodes(root);
	}
	

}

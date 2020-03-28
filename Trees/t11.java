import java.util.*;
//no of leaf nodes iteratively
public class t11 {

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
	private static void leafnodes(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			ArrayDeque<TreeNode> q=new ArrayDeque<TreeNode>();
			TreeNode curr=root;
			int leafnodes=0;
			while(curr!=null)
			{
				if(curr.left==null&&curr.right==null)
				{
					leafnodes++;
				}
				else
				{
					if(curr.left!=null)
					{
						q.add(curr.left);
					}
					if(curr.right!=null)
					{
						q.add(curr.right);
					}
				}
				curr=q.poll();
			}
			System.out.print("No of leaf nodes : "+leafnodes);
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
		leafnodes(root);
	}

}

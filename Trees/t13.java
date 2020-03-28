import java.util.*;
//spiral level order traversal using 2 stacks
public class t13 {

	static class TreeNode
	{
		int data;
		TreeNode left,right;
		TreeNode(int d)
		{
			data=d;
			left=right=null;
		}
	}
	public static void spiraltraversal(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			TreeNode curr=root;
			Stack<TreeNode> s1=new Stack<TreeNode>();
			Stack<TreeNode> s2=new Stack<TreeNode>();
			s1.add(curr);
			while((!s1.isEmpty())||(!s2.isEmpty()))
			{
				while(!s1.isEmpty())
				{
					curr=s1.pop();
					System.out.print(curr.data+" ");
					if(curr.left!=null)
					{
					s2.push(curr.left);
					}
					if(curr.right!=null)
					{
					s2.push(curr.right);
					}
				}
				System.out.println();
				while(!s2.isEmpty())
				{
					curr=s2.pop();
					System.out.print(curr.data+" ");
					if(curr.right!=null)
					{
					s1.push(curr.right);
					}
					if(curr.left!=null)
					{
					s1.push(curr.left);
					}
				}
				System.out.println();
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
		spiraltraversal(root);
	}

}
